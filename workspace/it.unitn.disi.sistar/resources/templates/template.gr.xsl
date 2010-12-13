<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xmi="http://www.omg.org/XMI"
	xmlns:tr="http://www.troposproject.org">
	<xsl:param name="instantiation">false</xsl:param>
	<xsl:param name="depth">false</xsl:param>
	<xsl:param name="condition">false</xsl:param>
	<xsl:output method="xml" omit-xml-declaration="yes" />
	<xsl:variable name="oldName" select='" ()!@#$%^*-+=?/.,:;~{}[]\|&amp;&gt;&lt;&apos;ABCDEFGHIJKLMNOPQRSTUVWXYZ"'/>
	<xsl:variable name="newName" select="'______________________________abcdefghijklmnopqrstuvwxyz'"/>
	<xsl:strip-space elements="/*" />
	<xsl:template match="/xmi:XMI">
		<xsl:apply-templates select="tr:Diagram/object" mode="object" />
	</xsl:template>
	<xsl:template match="tr:Diagram/object" mode="object">
		<xsl:choose>
			<xsl:when test="@xmi:type='tr:Actor'">
				<xsl:call-template name="elementObject">
					<xsl:with-param name="predicate">
						<xsl:call-template name="objectSwitch">
							<xsl:with-param name="objectType" select="@actorType"/>
						</xsl:call-template>
					</xsl:with-param>
					<xsl:with-param name="objectName" select="@name"/>
				</xsl:call-template>
				<xsl:for-each select="services">
					<xsl:call-template name="service" />
				</xsl:for-each>
			</xsl:when>
			<xsl:when test="@xmi:type='tr:Service'">
				<xsl:call-template name="service" />
			</xsl:when>
			<xsl:when test="@xmi:type='tr:Composition'">
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="relation" />
			</xsl:otherwise>
		</xsl:choose>
		<xsl:if  test="@xmi:type='tr:Service'">
			<xsl:call-template name="composition" />
		</xsl:if>
		<xsl:for-each select="services">
			<xsl:call-template name="composition" />
		</xsl:for-each>
	</xsl:template>
	<xsl:template name="service">
		<xsl:call-template name="elementObject">
			<xsl:with-param name="predicate">
				<xsl:call-template name="objectSwitch">
					<xsl:with-param name="objectType" select="@serviceType"/>
				</xsl:call-template>
			</xsl:with-param>
			<xsl:with-param name="objectName" select="@name"/>
		</xsl:call-template>
	</xsl:template>
	<xsl:template name="relation">
		<xsl:variable name="source" select="@source" />
		<xsl:variable name="sourceName"
			select="//object[@xmi:id=$source]/@name|//services[@xmi:id=$source]/@name" />
		<xsl:variable name="sourceType"
			select="//object[@xmi:id=$source]/@xmi:type|//services[@xmi:id=$source]/@xmi:type" />
		<xsl:variable name="target" select="@target" />
		<xsl:variable name="targetName"
			select="//object[@xmi:id=$target]/@name|//services[@xmi:id=$target]/@name" />
		<xsl:variable name="targetType"
			select="//object[@xmi:id=$target]/@xmi:type|//services[@xmi:id=$target]/@xmi:type" />
		<xsl:choose>
			<xsl:when test="@xmi:type='tr:Dependency'">
				<xsl:choose>
				    <xsl:when test="$sourceType='tr:Service'">
				    	<!--If there is an Owner Element for the service source -->
						<xsl:if test="//services[@xmi:id=$source]/../@name">
							<xsl:variable name="dependencyProperties" select="@dependencyProperties"/>
							<xsl:variable name="depthProperty" select="substring-after($dependencyProperties, 'DEPTH=')"/>
							<xsl:variable name="conditionProperty" select="substring-after($dependencyProperties, 'CONDITION=')"/>
							
							<xsl:call-template name="ternaryRelation">
								<xsl:with-param name="predicate">
									<xsl:call-template name="dependencySwitch">
										<xsl:with-param name="dType" select="@dependencyType" />
									</xsl:call-template>
								</xsl:with-param>
								<!--  Owner Element, Target Element, Source Element(Service)  -->
								<xsl:with-param name="firstObject" select="//services[@xmi:id=$source]/../@name" />
								<xsl:with-param name="secondObject" select="$targetName" />
								<xsl:with-param name="thirdObject" select="$sourceName" />
								<xsl:with-param name="depthObject">
   								<xsl:choose>
   									<xsl:when test="contains($depthProperty, ',')='true'">
   										<xsl:value-of select="substring-before($depthProperty, ',')"/>
   									</xsl:when>
   									<xsl:otherwise>
   										<xsl:value-of select="$depthProperty"/>
   									</xsl:otherwise>
   								</xsl:choose>
   								</xsl:with-param>
   								<xsl:with-param name="conditionObject">
   								<xsl:choose>
   									<xsl:when test="contains($conditionProperty, ',')='true'">
   										<xsl:value-of select="substring-before($conditionProperty, ',')"/>
   									</xsl:when>
   									<xsl:otherwise>
   										<xsl:value-of select="$conditionProperty"/>
   									</xsl:otherwise>
   								</xsl:choose>
   								</xsl:with-param>
							</xsl:call-template>
				    	</xsl:if>
				    </xsl:when>
					<xsl:otherwise>
						<xsl:variable name="dependencyType"
							select="@dependencyType" />			
						<xsl:variable name="nextTargetElementLink"
								select="//object[@source=$target][@dependencyType=$dependencyType]/@target|
										//services[@source=$target][@dependencyType=$dependencyType]/@target" />						
						<xsl:variable name="nextTargetElementName"
							select="//object[@xmi:id=$nextTargetElementLink]/@name|services[@xmi:id=nextTargetElementLink]/@name" />			
						<xsl:if test="$nextTargetElementLink">
							<xsl:variable name="dependencyProperties" select="@dependencyProperties"/>
							<xsl:variable name="depthProperty" select="substring-after($dependencyProperties, 'DEPTH=')"/>
							<xsl:variable name="conditionProperty" select="substring-after($dependencyProperties, 'CONDITION=')"/>
							
							<!--  Source Element, Next Target Element, Target Element (Service)  -->
							<xsl:call-template name="ternaryRelation">
								<xsl:with-param name="predicate">
									<xsl:call-template name="dependencySwitch">
     						 			<xsl:with-param name="dType" select="@dependencyType"/>
   									</xsl:call-template>
   								</xsl:with-param>
   								<xsl:with-param name="firstObject" select="$sourceName"/>
   								<xsl:with-param name="secondObject" select="$nextTargetElementName"/>
   								<xsl:with-param name="thirdObject" select="$targetName"/>
   								<xsl:with-param name="depthObject">
   								<xsl:choose>
   									<xsl:when test="contains($depthProperty, ',')='true'">
   										<xsl:value-of select="substring-before($depthProperty, ',')"/>
   									</xsl:when>
   									<xsl:otherwise>
   										<xsl:value-of select="$depthProperty"/>
   									</xsl:otherwise>
   								</xsl:choose>
   								</xsl:with-param>
   								<xsl:with-param name="conditionObject">
   								<xsl:choose>
   									<xsl:when test="contains($conditionProperty, ',')='true'">
   										<xsl:value-of select="substring-before($conditionProperty, ',')"/>
   									</xsl:when>
   									<xsl:otherwise>
   										<xsl:value-of select="$conditionProperty"/>
   									</xsl:otherwise>
   								</xsl:choose>
   								</xsl:with-param>
				    		</xsl:call-template>
						</xsl:if>
						<!--If there is an Owner Element for the service target -->
						<!--<xsl:if test="//services[@xmi:id=$target]/../@name">
							  Source Element, Target Owner Element, Target Element (Service)  
							<xsl:call-template name="ternaryRelation">
								<xsl:with-param name="predicate">
									<xsl:call-template name="dependencySwitch">
     						 			<xsl:with-param name="dType" select="@dependencyType"/>
   									</xsl:call-template>
   								</xsl:with-param>
   								<xsl:with-param name="firstObject" select="$sourceName"/>
   								<xsl:with-param name="secondObject" select="//services[@xmi:id=$target]/../@name"/>
   								<xsl:with-param name="thirdObject" select="$targetName"/>
				    		</xsl:call-template>
						</xsl:if>-->
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="binaryRelation">
					<xsl:with-param name="predicate">
						<xsl:choose>
							<xsl:when
								test="@xmi:type='tr:Contribution'">
								<xsl:call-template
									name="contributionSwitch">
									<xsl:with-param name="cType"
										select="@contributionType" />
								</xsl:call-template>
							</xsl:when>
							<xsl:when
								test="@xmi:type='tr:Association'">
								<xsl:call-template
									name="associationSwitch">
									<xsl:with-param name="aType"
										select="@associationType" />
								</xsl:call-template>
							</xsl:when>
							<xsl:when test="@xmi:type='tr:Ownership'">
								<xsl:call-template
									name="ownershipSwitch">
									<xsl:with-param name="oType"
										select="@ownershipType" />
									<xsl:with-param name="iType"
										select="@instantiation" />
								</xsl:call-template>
							</xsl:when>
							<xsl:when test="@xmi:type='tr:MeansEnd'">
								<xsl:text>means_end</xsl:text>
							</xsl:when>
							<xsl:when test="@xmi:type='tr:CustomRelation'">
								<xsl:value-of select="@predicate"></xsl:value-of>
							</xsl:when>
						</xsl:choose>
					</xsl:with-param>
   					<xsl:with-param name="firstObject" select="$sourceName"/>
   					<xsl:with-param name="secondObject" select="$targetName"/>
			</xsl:call-template>
		</xsl:otherwise>
	</xsl:choose>
	</xsl:template>

	<xsl:template name="composition">
				<xsl:variable name="ID" select="@xmi:id"/>
				<xsl:variable name="subgoalcount" 
				select="count(//object[@source=$ID][@xmi:type='tr:Composition'])"/>
				<xsl:variable name="prefix"> 
				<xsl:if test="$subgoalcount &gt; 0">
					<xsl:value-of select="subgoaltype"></xsl:value-of>
					<xsl:text>_decomposition</xsl:text>
					<xsl:value-of select="$subgoalcount"></xsl:value-of>
					<xsl:text>(</xsl:text>
					<xsl:variable name="elementName"
					select='translate(@name,$oldName,$newName)' />
					<xsl:value-of select='$elementName'></xsl:value-of>
					<xsl:text>,</xsl:text>
				</xsl:if>
				</xsl:variable>
				<xsl:for-each select="//object[@source=$ID][@xmi:type='tr:Composition']">
					<xsl:variable name="compositionType" >
						<xsl:choose>
							<xsl:when test="@compositionType='AND'">
								<xsl:text>and</xsl:text>
							</xsl:when>
							<xsl:when test="@compositionType='OR'">
								<xsl:text>or</xsl:text>
							</xsl:when>
						</xsl:choose>
					</xsl:variable>
					<xsl:if test="position()=1">
						<xsl:value-of select="$compositionType"></xsl:value-of>
						<xsl:value-of select="$prefix"></xsl:value-of>
					</xsl:if>
					<xsl:variable name="target" select="@target"/>
					<xsl:variable name="elementName"
					select='translate(//object[@xmi:id=$target]/@name|//services[@xmi:id=$target]/@name,$oldName,$newName)' />
					<xsl:value-of select='$elementName'></xsl:value-of>
					<xsl:if test="position()!=last()">
						<xsl:text>,</xsl:text>
					</xsl:if>
				</xsl:for-each>
				<xsl:if test="$subgoalcount &gt; 0">
					<xsl:text>).</xsl:text>
					<xsl:text>&#10;</xsl:text>
				</xsl:if>
	</xsl:template>
	<xsl:template name="objectSwitch">
		<xsl:param name="objectType"/>
		
		<xsl:choose>
			<xsl:when test="$objectType='ACTOR'">
				<xsl:text>actor</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='ROLE'">
				<xsl:text>role</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='AGENT'">
				<xsl:text>agent</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='POSITION'">
				<xsl:text>position</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='GOAL'">
				<xsl:text>goal</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='SOFTGOAL'">
				<xsl:text>softgoal</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='TASK'">
				<xsl:text>task</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='RESOURCE'">
				<xsl:text>resource</xsl:text>
			</xsl:when>
			<xsl:when test="$objectType='EVENT'">
				<xsl:text>event</xsl:text>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="elementObject">
		<xsl:param name="predicate"/>
		<xsl:param name="objectName"/>
		
		<xsl:value-of select="$predicate"/>
		<xsl:text >(</xsl:text>
			<xsl:value-of select="translate($objectName,$oldName,$newName)"/>
		<xsl:text >).</xsl:text>
		<xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template name="binaryRelation">
		<xsl:param name="predicate"/>
		<xsl:param name="firstObject"/>
		<xsl:param name="secondObject"/>
		
		<xsl:choose>
			<xsl:when test="string-length($predicate)=0">
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$predicate"/>
				<xsl:text >(</xsl:text>
					<xsl:value-of select="translate($firstObject,$oldName,$newName)"/>
				<xsl:text >,</xsl:text>
					<xsl:value-of select="translate($secondObject,$oldName,$newName)"/>
				<xsl:text >).</xsl:text>
				<xsl:text>&#10;</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="ternaryRelation">
		<xsl:param name="predicate"/>
		<xsl:param name="firstObject"/>
		<xsl:param name="secondObject"/>
		<xsl:param name="thirdObject"/>
		<xsl:param name="depthObject"/>
		<xsl:param name="conditionObject"/>
		
		<xsl:if test="$depth='true'">
			<xsl:if test="string-length($depthObject)=0">
				<xsl:text>full_</xsl:text>
			</xsl:if>
		</xsl:if>
		<xsl:value-of select="$predicate"/>
		<xsl:text >(</xsl:text>
			<xsl:value-of select="translate($firstObject,$oldName,$newName)"/>
		<xsl:text >,</xsl:text>
			<xsl:value-of select="translate($secondObject,$oldName,$newName)"/>
		<xsl:text >,</xsl:text>
			<xsl:value-of select="translate($thirdObject,$oldName,$newName)"/>
		<xsl:if test="$depth='true'">
			<xsl:if test="string-length($depthObject)>0">
				<xsl:text >,</xsl:text>
				<xsl:value-of select="$depthObject"/> 
			</xsl:if>
		</xsl:if>
		<xsl:text >)</xsl:text>
		<xsl:if test="$condition='true'">
			<xsl:text >:-</xsl:text>
			<xsl:value-of select="$conditionObject"/> 
		</xsl:if>
		<xsl:text>.</xsl:text>
		<xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template name="dependencySwitch">
		<xsl:param name="dType"/>
		<xsl:choose>
			<xsl:when test="$dType='DELEGATION_EXECUTION'">
				<xsl:text>del_exec</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='DELEGATION_PERMISSION'">
				<xsl:text>del_perm</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='TRUST_EXECUTION'">
				<xsl:text>trust_exec</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='TRUST_PERMISSION'">
				<xsl:text>trust_perm</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='DISTRUST_EXECUTION'">
				<xsl:text>distrust_exec</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='DISTRUST_PERMISSION'">
				<xsl:text>distrust_perm</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='TRUST_MONITOR'">
				<xsl:text>trust_mon</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='MONITORING_PERMISSION'">
				<xsl:text>monitoring_perm</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='MONITORING_EXECUTION'">
				<xsl:text>monitoring_exec</xsl:text>
			</xsl:when>
			<xsl:when test="$dType='DEPENDENCY'">
				<xsl:text>depend</xsl:text>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="associationSwitch">
		<xsl:param name="aType"/>
		<xsl:choose>
			<xsl:when test="$aType='IS_A'">
				<xsl:text>is_a</xsl:text>
			</xsl:when>
			<xsl:when test="$aType='PLAY'">
				<xsl:text>play</xsl:text>
			</xsl:when>
			<xsl:when test="$aType='COVER'">
				<xsl:text>cover</xsl:text>
			</xsl:when>
			<xsl:when test="$aType='SUPERVISE'">
				<xsl:text>supervise</xsl:text>
			</xsl:when>
			<xsl:when test="$aType='OCCUPY'">
				<xsl:text>occupy</xsl:text>
			</xsl:when>
			<xsl:when test="$aType='IS_PART_OF'">
				<xsl:text>is_part_of</xsl:text>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="ownershipSwitch">
		<xsl:param name="oType"/>
		<xsl:param name="iType"/>
		<xsl:choose>
			<xsl:when test="$oType='OWN'">
				<xsl:text>own</xsl:text>
				<xsl:if test="$instantiation='true'">
				<xsl:choose>
					<xsl:when test="$iType='UNIVERSAL'">
						<xsl:text>_universal</xsl:text>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>_existential</xsl:text>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:if>
			</xsl:when>
			<xsl:when test="$oType='REQUEST'">
				<xsl:text>request</xsl:text>
			</xsl:when>
			<xsl:when test="$oType='PROVIDE'">
				<xsl:text>provide</xsl:text>
			</xsl:when>
		</xsl:choose>
		
	</xsl:template>
	<xsl:template name="contributionSwitch">
		<xsl:param name="cType"/>
		<xsl:choose>
			<xsl:when test="$cType='M'">
				<xsl:text>neg_contribution</xsl:text>
			</xsl:when>
			<xsl:when test="$cType='MM'">
				<xsl:text>neg_contribution</xsl:text>
			</xsl:when>
			<xsl:when test="$cType='P'">
				<xsl:text>pos_contribution</xsl:text>
			</xsl:when>
			<xsl:when test="$cType='PP'">
				<xsl:text>pos_contribution</xsl:text>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
</xsl:stylesheet>