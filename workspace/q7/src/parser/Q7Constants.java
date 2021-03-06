/* Generated By:JavaCC: Do not edit this line. Q7Constants.java */
package parser;

public interface Q7Constants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 9;
  int FORMAL_COMMENT = 10;
  int MULTI_LINE_COMMENT = 11;
  int TRUE = 13;
  int FALSE = 14;
  int INTEGER_LITERAL = 15;
  int DECIMAL_LITERAL = 16;
  int HEX_LITERAL = 17;
  int OCTAL_LITERAL = 18;
  int NON_NEGATIVE_FLOATING_POINT_LITERAL = 19;
  int FLOATING_POINT_LITERAL = 20;
  int EXPONENT = 21;
  int CHARACTER_LITERAL = 22;
  int STRING_LITERAL = 23;
  int LEFT_BRACKET = 24;
  int RIGHT_BRACKET = 25;
  int LEFT_BR = 26;
  int RIGHT_BR = 27;
  int LEFT_BRACE = 28;
  int RIGHT_BRACE = 29;
  int LEFT_PAR = 30;
  int RIGHT_PAR = 31;
  int WEAVES = 32;
  int AT = 33;
  int IMPLIES = 34;
  int DEPENDS = 35;
  int MAKE = 36;
  int HELP = 37;
  int HURT = 38;
  int BREAK = 39;
  int AND = 40;
  int OR = 41;
  int ANDSYMB = 42;
  int ORSYMB = 43;
  int SCOPE = 44;
  int COMMA = 45;
  int SEMICOLON = 46;
  int PARALLEL = 47;
  int STAR = 48;
  int SLASH = 49;
  int DEP = 50;
  int AS = 51;
  int ALIAS = 52;
  int LABEL_FS = 53;
  int LABEL_PS = 54;
  int LABEL_PD = 55;
  int LABEL_FD = 56;
  int LABEL_CF = 57;
  int LABEL_UN = 58;
  int ID = 59;
  int LETTER = 60;
  int DIGIT = 61;

  int DEFAULT = 0;
  int IN_SINGLE_LINE_COMMENT = 1;
  int IN_FORMAL_COMMENT = 2;
  int IN_MULTI_LINE_COMMENT = 3;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"//\"",
    "<token of kind 7>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 12>",
    "\"true\"",
    "\"false\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<NON_NEGATIVE_FLOATING_POINT_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\"[\"",
    "\"]\"",
    "\"<\"",
    "\">\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"<=\"",
    "\"@\"",
    "\"=>\"",
    "\"==>\"",
    "\"++\"",
    "\"+\"",
    "\"-\"",
    "\"--\"",
    "\"AND\"",
    "\"OR\"",
    "\"&\"",
    "\"|\"",
    "\"::\"",
    "\",\"",
    "\";\"",
    "\"||\"",
    "\"*\"",
    "\"/\"",
    "\"~\"",
    "\"=\"",
    "\"AS\"",
    "\"FS\"",
    "\"PS\"",
    "\"PD\"",
    "\"FD\"",
    "\"CF\"",
    "\"UN\"",
    "<ID>",
    "<LETTER>",
    "<DIGIT>",
  };

}
