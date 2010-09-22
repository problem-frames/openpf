<stylesheet xmlns="http://www.w3.org/1999/XSL/Transform" version = "1.0" >
	<output method="text"/>
	<template match="/">
           	<for-each select="/product/features/feature">
			<value-of select="@id"/>
			<text>&#10;</text>
           	</for-each>
	</template>
</stylesheet>

