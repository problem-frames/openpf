<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" 
	xmlns:tr="http://www.troposproject.org" xmlns:xmi="http://www.omg.org/XMI" 
		xmlns:notation="http://www.eclipse.org/gmf/runtime/1.0.0/notation" >
	<xsl:template match="/GOALMODEL">
		<xmi:XMI xmi:version="2.0">
			<xsl:apply-templates select="DIAGRAM/GRAPH" />
		</xmi:XMI>
	</xsl:template>
	<xsl:template match="DIAGRAM/GRAPH">
		<xsl:variable name="diagramName">
			<xsl:text>diagram</xsl:text>
			<xsl:value-of select="position()" />
		</xsl:variable>
		<tr:Diagram>
			<xsl:attribute name="xmi:id">
				<xsl:value-of select="$diagramName" />
			</xsl:attribute>
			<xsl:apply-templates select="NODE" mode="domainMode"></xsl:apply-templates>
			<xsl:apply-templates select="ARC" mode="domainMode"></xsl:apply-templates>
		</tr:Diagram><xsl:text>&#10;</xsl:text>
		<notation:Diagram xmi:version="2.0"
			type="Tropos" measurementUnit="Pixel">
			<xsl:attribute name="name">
				<xsl:value-of select="@NAME" />
			</xsl:attribute>
			<xsl:attribute name="element">
				<xsl:value-of select="$diagramName" />
			</xsl:attribute>
			<xsl:apply-templates select="NODE" mode="diagramMode" ></xsl:apply-templates>
			<xsl:apply-templates select="ARC" mode="diagramMode" />
			<styles xmi:type="notation:PageStyle" />
			<styles xmi:type="notation:GuideStyle" />
			<styles xmi:type="notation:DescriptionStyle" />
		</notation:Diagram><xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template match="ARC" mode="domainMode">
		<object>
			<xsl:variable name="data">
  	 			<xsl:value-of select="DATA"/>
 			</xsl:variable>
			<xsl:choose>
				<xsl:when test='MODEL="Association"'>
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Association</xsl:text>
					</xsl:attribute>
					<xsl:attribute name="associationType">
					<xsl:choose>
						<xsl:when test='ASSOCIATION=0'>
							<xsl:text>IS_PART_OF</xsl:text>
						</xsl:when>
						<xsl:when test='ASSOCIATION=1'>
							<xsl:text>IS_A</xsl:text>
						</xsl:when>
						<xsl:when test='ASSOCIATION=2'>
							<xsl:text>PLAY</xsl:text>
						</xsl:when>
						<xsl:when test='ASSOCIATION=3'>
							<xsl:text>COVER</xsl:text>
						</xsl:when>
						<xsl:when test='ASSOCIATION=4'>
							<xsl:text>OCCUPY</xsl:text>
						</xsl:when>
					</xsl:choose>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="MODEL='Contribution'">
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Contribution</xsl:text>
					</xsl:attribute>
					<xsl:variable name="val">
						<xsl:value-of select="VALUE"></xsl:value-of>
					</xsl:variable>
					<xsl:attribute name="contributionType">
					<xsl:choose>
						<xsl:when test='number($val)=number(0.0)'>
							<xsl:text>P</xsl:text>
						</xsl:when>
						<xsl:when test='number($val)=number(1.0)'>
							<xsl:text>PP</xsl:text>
						</xsl:when>
						<xsl:when test='number($val)=number(-0.5)'>
							<xsl:text>M</xsl:text>
						</xsl:when>
						<xsl:when test='number($val)=number(-1.0)'>
							<xsl:text>MM</xsl:text>
						</xsl:when>
					</xsl:choose>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="MODEL='Composition'">
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Composition</xsl:text>
					</xsl:attribute>
					<xsl:variable name="startNode">
						<xsl:value-of select="NODES/START"/>
					</xsl:variable>
					<xsl:variable name="supergoalData">
						<xsl:value-of select="//NODE[ID=$startNode]/DATA"/>
					</xsl:variable>
					<xsl:attribute name="compositionType">
						<xsl:value-of select="//SERVICE[@ID=$supergoalData]/DECOMPOSITION"></xsl:value-of>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="MODEL='Ownership'" >
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Ownership</xsl:text>
					</xsl:attribute>
					<xsl:attribute name="ownershipType">
						<xsl:text>OWN</xsl:text>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="MODEL='Pretend'" >
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Ownership</xsl:text>
					</xsl:attribute>
					<xsl:attribute name="ownershipType">
						<xsl:text>REQUEST</xsl:text>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="MODEL='Provide'" >
					<xsl:attribute name="xmi:type">
						<xsl:text>tr:Ownership</xsl:text>
					</xsl:attribute>
					<xsl:attribute name="ownershipType">
						<xsl:text>PROVIDE</xsl:text>
					</xsl:attribute>
				</xsl:when>
				<xsl:otherwise>
				    <xsl:attribute name="xmi:type">
						<xsl:text>tr:Dependency</xsl:text>
					</xsl:attribute>
					<xsl:attribute name="dependencyType">
					<xsl:choose>
						<xsl:when test="MODEL='Dependency'">
						 	<xsl:text>DEPENDENCY</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='DelegationExecution'">
							<xsl:text>DELEGATION_EXECUTION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='DelegationPermission'">
							<xsl:text>DELEGATION_PERMISSION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='TrustExecution'">
							<xsl:text>TRUST_EXECUTION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='TrustPermission'">
							<xsl:text>TRUST_PERMISSION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='DistrustPermission'">
							<xsl:text>DISTRUST_PERMISSION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='DistrustExecution'">
							<xsl:text>DISTRUST_EXECUTION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='TrustMonitor'">
							<xsl:text>TRUST_MONITOR</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='MonitoringPermission'">
							<xsl:text>MONITORING_PERMISSION</xsl:text>
						</xsl:when>
						<xsl:when test="MODEL='MonitoringExecution'">
							<xsl:text>MONITORING_EXECUTION</xsl:text>
						</xsl:when>
					</xsl:choose>
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:attribute name="xmi:id">
				<xsl:value-of select="ID"></xsl:value-of>
			</xsl:attribute>
			<xsl:attribute name="source">
				<xsl:choose>
					<xsl:when test="MODEL='Composition'">
						<xsl:value-of select="NODES/END"></xsl:value-of>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="NODES/START"></xsl:value-of>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<xsl:attribute name="target">
				<xsl:choose>
					<xsl:when test="MODEL='Composition'">
							<xsl:value-of select="NODES/START"></xsl:value-of>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="NODES/END"></xsl:value-of>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
		</object><xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template match="ARC" mode="diagramMode">
		<edges xmi:type="notation:Edge">
			<xsl:attribute name="source">
				<xsl:choose>
					<xsl:when test='MODEL="Composition"'>
						<xsl:text>id</xsl:text><xsl:value-of select="NODES/END"></xsl:value-of>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>id</xsl:text><xsl:value-of select="NODES/START"></xsl:value-of>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<xsl:attribute name="target">
				<xsl:choose>
					<xsl:when test='MODEL="Composition"'>
						<xsl:text>id</xsl:text><xsl:value-of select="NODES/START"></xsl:value-of>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>id</xsl:text><xsl:value-of select="NODES/END"></xsl:value-of>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<xsl:attribute name="element">
				<xsl:value-of select="ID"></xsl:value-of>
			</xsl:attribute>
			<xsl:attribute name="type">
			<xsl:choose>
				<xsl:when test='MODEL="Association"'>
					<xsl:text>3001</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="Contribution"'>
					<xsl:text>3002</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="Composition"'>
					<xsl:text>3003</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="Dependency"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="DelegationPermission"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="DelegationExecution"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="TrustPermission"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="TrustExecution"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="DistrustPermission"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="DistrustExecution"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="MonitoringPermission"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="MonitoringExecution"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="TrustMonitor"'>
					<xsl:text>3004</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="Ownership"'>
					<xsl:text>3005</xsl:text>
				</xsl:when>
					<xsl:when test='MODEL="Pretend"'>
					<xsl:text>3005</xsl:text>
				</xsl:when>
				<xsl:when test='MODEL="Provide"'>
					<xsl:text>3005</xsl:text>
				</xsl:when>
			</xsl:choose>
			</xsl:attribute>
				<xsl:choose>
					<xsl:when test='MODEL="Association"'>
						<children xmi:type="notation:Node" type="4004">
							<layoutConstraint xmi:type="notation:Location" x="-10"/>
						</children>
					</xsl:when>
					<xsl:when test='MODEL="Contribution"'>
					<children xmi:type="notation:Node" type="4005">
							<layoutConstraint xmi:type="notation:Location" x="-10" y="-10" />
					</children>
					</xsl:when>
				</xsl:choose>
			<styles xmi:type="notation:RoutingStyle" />
			<styles xmi:type="notation:FontStyle" />
			<xsl:variable name="xLoc" select="BOUNDS/X" />
			<xsl:variable name="yLoc" select="BOUNDS/Y" />
			<xsl:variable name="wLoc" select="BOUNDS/W" />
			<xsl:variable name="hLoc" select="BOUNDS/H" />
			<xsl:variable name="cPoint1" select="substring-before(CTRLPOINT[1],',')" />
			<xsl:variable name="cPoint2" select="substring-after(CTRLPOINT[1],',')" />
			<xsl:variable name="cPoint3" select="substring-before(CTRLPOINT[2],',')" />
			<xsl:variable name="cPoint4" select="substring-after(CTRLPOINT[2],',')" />
			<bendpoints xmi:type="notation:RelativeBendpoints" >
				<xsl:attribute name="points">
				<xsl:choose>
					<xsl:when test="CTRLPOINT[1]">
						<xsl:text>[0,0,</xsl:text>
						<xsl:value-of select="$wLoc"/>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="$hLoc"/>
						<xsl:text>]$</xsl:text>
						<xsl:text>[</xsl:text>
						<xsl:value-of select="$cPoint1"/>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="$cPoint2"/>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="($wLoc*-1 - $cPoint1)"/>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="($hLoc*-1 - $cPoint2)"/>
						<xsl:text>]$</xsl:text>
						<xsl:if test="CTRLPOINT[2]">
							<xsl:text>[</xsl:text>
							<xsl:value-of select="$cPoint3"/>
							<xsl:text>,</xsl:text>
							<xsl:value-of select="$cPoint4"/>
							<xsl:text>,</xsl:text>
							<xsl:value-of select="($wLoc - $cPoint3)*-1"/>
							<xsl:text>,</xsl:text>
							<xsl:value-of select="($hLoc - $cPoint4)*-1"/>
							<xsl:text>]$</xsl:text>
						</xsl:if>
						<xsl:text>[</xsl:text>
						<xsl:value-of select="$wLoc"/>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="$hLoc"/><xsl:text>,0,0]</xsl:text>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>[1,2,3,4]$[5,6,7,8]</xsl:text>
					</xsl:otherwise>
					</xsl:choose>
				</xsl:attribute>
			</bendpoints>
		</edges><xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template match="NODE" mode="domainMode">
		<xsl:if test="not(OWNER)">
			<object>
				<xsl:variable name="data">
	  	 			<xsl:value-of select="DATA"/>
	 			</xsl:variable>
	 			<xsl:variable name="objectId">
	  	 			<xsl:value-of select="ID"/>
	 			</xsl:variable>
				<xsl:attribute name="name">
					<xsl:choose>
						<xsl:when test="@CLASS='ACTOR'">
							<xsl:value-of select="//ACTOR[@ID=$data]/CAPTION"></xsl:value-of>
						</xsl:when>
					</xsl:choose>
					<xsl:choose>
						<xsl:when test="@CLASS='SERVICE'">
							<xsl:value-of select="//SERVICE[@ID=$data]/CAPTION"></xsl:value-of>
						</xsl:when>
					</xsl:choose>
				</xsl:attribute>
				<xsl:attribute name="xmi:id">
					<xsl:value-of select="ID"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="xmi:type">
				<xsl:choose>
					<xsl:when test="@CLASS='ACTOR'">
						<xsl:text>tr:Actor</xsl:text>
					</xsl:when> 
					<xsl:when test="@CLASS='SERVICE'">
						<xsl:text>tr:Service</xsl:text>
					</xsl:when>
				</xsl:choose>
				</xsl:attribute>
				<xsl:choose>
					<xsl:when test='MODEL="Actor"'>
						<xsl:attribute name="actorType">
							<xsl:text>ACTOR</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Agent"'>
						<xsl:attribute name="actorType">
							<xsl:text>AGENT</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Role"'>
						<xsl:attribute name="actorType">
							<xsl:text>ROLE</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Position"'>
						<xsl:attribute name="actorType">
							<xsl:text>POSITION</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Goal"'>
						<xsl:attribute name="serviceType">
							<xsl:text>GOAL</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="SoftGoal"'>
						<xsl:attribute name="serviceType">
							<xsl:text>SOFTGOAL</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Task"'>
						<xsl:attribute name="serviceType">
							<xsl:text>TASK</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Resource"'>
						<xsl:attribute name="serviceType">
							<xsl:text>RESOURCE</xsl:text>
						</xsl:attribute>
					</xsl:when>
					<xsl:when test='MODEL="Event"'>
						<xsl:attribute name="serviceType">
							<xsl:text>EVENT</xsl:text>
						</xsl:attribute>
					</xsl:when>
				</xsl:choose>
				<xsl:for-each select="//NODE[OWNER=$objectId]">
					<services>
						<xsl:attribute name="xmi:type">
							<xsl:text>tr:Service</xsl:text>
						</xsl:attribute>
						<xsl:attribute name="xmi:id">
							<xsl:value-of select="ID"></xsl:value-of>
						</xsl:attribute>
						<xsl:variable name="innerData">
							<xsl:value-of select="DATA"></xsl:value-of>
						</xsl:variable>
						<xsl:attribute name="name">
							<xsl:value-of select="//SERVICE[@ID=$innerData]/CAPTION"></xsl:value-of>
						</xsl:attribute>
						<xsl:attribute name="serviceType">
						<xsl:choose>
							<xsl:when test='MODEL="Goal"'>
								<xsl:text>GOAL</xsl:text>
							</xsl:when>
							<xsl:when test='MODEL="SoftGoal"'>
								<xsl:text>SOFTGOAL</xsl:text>
							</xsl:when>
							<xsl:when test='MODEL="Task"'>
									<xsl:text>TASK</xsl:text>
							</xsl:when>
							<xsl:when test='MODEL="Resource"'>
								<xsl:text>RESOURCE</xsl:text>
							</xsl:when>
							<xsl:when test='MODEL="Event"'>
								<xsl:text>EVENT</xsl:text>
							</xsl:when>
						</xsl:choose>
						</xsl:attribute>
					</services>
				</xsl:for-each>
			</object><xsl:text>&#10;</xsl:text>
		</xsl:if>
	</xsl:template>
	<xsl:template match="NODE" mode="diagramMode">
		<xsl:if test="not(OWNER)">
			<children xmi:type="notation:Node" >
				<xsl:variable name="objectId">
					<xsl:value-of select="ID"></xsl:value-of>
				</xsl:variable>
				<xsl:attribute name="element">
					<xsl:value-of select="$objectId"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="xmi:id">
					<xsl:text>id</xsl:text>
					<xsl:value-of select="ID"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="type">
					<xsl:choose>
						<xsl:when test="@CLASS='ACTOR'">
							<xsl:text>1001</xsl:text>
						</xsl:when> 
						<xsl:when test="@CLASS='SERVICE'">
							<xsl:text>2001</xsl:text>
						</xsl:when>
					</xsl:choose>
				</xsl:attribute>
				<children xmi:type="notation:Node">
				<xsl:attribute name="type">
					<xsl:choose>
					<xsl:when test="@CLASS='ACTOR'">
							<xsl:text>4002</xsl:text>
						</xsl:when>
						<xsl:when test="@CLASS='SERVICE'">
							<xsl:text>4001</xsl:text>
						</xsl:when>
					</xsl:choose>
					</xsl:attribute>
				</children><xsl:text>&#10;</xsl:text>
				<xsl:if test="@CLASS='ACTOR'">
					<children xmi:type="notation:Node" type="5001">
						<xsl:variable name="xRef">
							<xsl:value-of select="FIELDX" />
						</xsl:variable>
						<xsl:variable name="yRef">
							<xsl:value-of select="FIELDY" />
						</xsl:variable>
						<xsl:for-each select="//NODE[OWNER=$objectId]">
							<children xmi:type="notation:Node" >
								<xsl:variable name="objectId">
									<xsl:value-of select="ID"></xsl:value-of>
								</xsl:variable>
								<xsl:attribute name="element">
									<xsl:value-of select="$objectId"></xsl:value-of>
								</xsl:attribute>
								<xsl:attribute name="xmi:id">
									<xsl:text>id</xsl:text>
									<xsl:value-of select="ID"></xsl:value-of>
								</xsl:attribute>
								<xsl:attribute name="type">
									<xsl:text>2001</xsl:text>
								</xsl:attribute>
								<children xmi:type="notation:Node">
								<xsl:attribute name="type">
									<xsl:text>4001</xsl:text>
								</xsl:attribute>
								</children><xsl:text>&#10;</xsl:text>
								<styles xmi:type="notation:FontStyle" /><xsl:text>&#10;</xsl:text>
								<styles xmi:type="notation:DescriptionStyle" /><xsl:text>&#10;</xsl:text>
								<styles xmi:type="notation:FillStyle" /><xsl:text>&#10;</xsl:text>
								<styles xmi:type="notation:LineStyle" /><xsl:text>&#10;</xsl:text>
								<layoutConstraint xmi:type="notation:Bounds">
									<xsl:variable name="xLoc">
										<xsl:value-of select="BOUNDS/X" />
									</xsl:variable>
									<xsl:variable name="yLoc">
										<xsl:value-of select="BOUNDS/Y" />
									</xsl:variable>
									<xsl:variable name="x1">
										<xsl:if test="$xLoc - $xRef &gt; 0">
											<xsl:value-of select="$xLoc - $xRef" />
										</xsl:if>
										<xsl:if test="$xLoc - $xRef &lt;= 0">
											<xsl:value-of select="$xLoc" />
										</xsl:if>
									</xsl:variable>
									<xsl:variable name="y1">
										<xsl:if test="$yLoc - $yRef &gt; 0">
											<xsl:value-of select="$yLoc - $yRef" />
										</xsl:if>
										<xsl:if test="$yLoc - $yRef &lt;= 0">
											<xsl:value-of select="$yLoc" />
										</xsl:if>
									</xsl:variable>
									
									<xsl:attribute name="x">
										<xsl:value-of select="$x1" />
									</xsl:attribute>
									<xsl:attribute name="y">
										<xsl:value-of select="$y1" />
									</xsl:attribute>
									<xsl:attribute name="width">
										<xsl:value-of select="BOUNDS/W" />
									</xsl:attribute>
									<xsl:attribute name="height">
										<xsl:value-of select="BOUNDS/H" />
									</xsl:attribute>
								</layoutConstraint>
							</children><xsl:text>&#10;</xsl:text>
						</xsl:for-each>
						<styles xmi:type="notation:DrawerStyle">
	        				<xsl:if test="//COLLAPSED_ACTORS/ACTOR=$objectId">
	        					<xsl:attribute name="collapsed">
	        						<xsl:text>true</xsl:text>
	        					</xsl:attribute>
	        				</xsl:if>
	        			</styles><xsl:text>&#10;</xsl:text>
	        			<styles xmi:type="notation:SortingStyle"/><xsl:text>&#10;</xsl:text>
	        			<styles xmi:type="notation:FilteringStyle"/><xsl:text>&#10;</xsl:text>
	        		</children>
	      		</xsl:if>
				<styles xmi:type="notation:FontStyle" /><xsl:text>&#10;</xsl:text>
				<styles xmi:type="notation:DescriptionStyle" /><xsl:text>&#10;</xsl:text>
				<styles xmi:type="notation:FillStyle" /><xsl:text>&#10;</xsl:text>
				<styles xmi:type="notation:LineStyle" /><xsl:text>&#10;</xsl:text>
				<layoutConstraint xmi:type="notation:Bounds">
					<xsl:attribute name="x">
						<xsl:choose>
							<xsl:when test="@CLASS='ACTOR'">
								<xsl:value-of select="FIELDX" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="BOUNDS/X" />
							</xsl:otherwise>
						</xsl:choose>	
					</xsl:attribute>
					<xsl:attribute name="y">
						<xsl:choose>
							<xsl:when test="@CLASS='ACTOR'">
								<xsl:value-of select="FIELDY" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="BOUNDS/Y" />
							</xsl:otherwise>
						</xsl:choose>	
					</xsl:attribute>
					<xsl:attribute name="width">
						<xsl:choose>
							<xsl:when test="@CLASS='ACTOR'">
								<xsl:value-of select="FIELDW" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="BOUNDS/W" />
							</xsl:otherwise>
						</xsl:choose>	
					</xsl:attribute>
					<xsl:attribute name="height">
						<xsl:choose>
							<xsl:when test="@CLASS='ACTOR'">
								<xsl:value-of select="FIELDH" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="BOUNDS/H" />
							</xsl:otherwise>
						</xsl:choose>	
					</xsl:attribute>
				</layoutConstraint>
			</children><xsl:text>&#10;</xsl:text>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>