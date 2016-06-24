package com.github.tommyettinger.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import com.github.tommyettinger.idea.lang.KoboldElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import com.github.tommyettinger.services.KoboldGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalKoboldParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'>'", "'>='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'++'", "'--'", "'.'", "'::'", "'?.'", "','", "'('", "')'", "'#'", "'{'", "'}'", "'['", "']'", "'|'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'synchronized'", "'catch'", "'?'", "'&'"
    };
    public static final int RULE_HEX=6;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public PsiInternalKoboldParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalKoboldParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalKoboldParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalKobold.g"; }



    	protected KoboldGrammarAccess grammarAccess;

    	protected KoboldElementTypeProvider elementTypeProvider;

    	public PsiInternalKoboldParser(PsiBuilder builder, TokenStream input, KoboldElementTypeProvider elementTypeProvider, KoboldGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalKobold.g:52:1: entryRuleModel returns [Boolean current=false] : iv_ruleModel= ruleModel EOF ;
    public final Boolean entryRuleModel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModel = null;


        try {
            // PsiInternalKobold.g:52:47: (iv_ruleModel= ruleModel EOF )
            // PsiInternalKobold.g:53:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getModelElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalKobold.g:59:1: ruleModel returns [Boolean current=false] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_greetings_0_0 = null;


        try {
            // PsiInternalKobold.g:60:1: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // PsiInternalKobold.g:61:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // PsiInternalKobold.g:61:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalKobold.g:62:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // PsiInternalKobold.g:62:3: (lv_greetings_0_0= ruleGreeting )
            	    // PsiInternalKobold.g:63:4: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markComposite(elementTypeProvider.getModel_GreetingsGreetingParserRuleCall_0ElementType());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneComposite();
            	      				if(!current) {
            	      					associateWithSemanticElement();
            	      					current = true;
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // PsiInternalKobold.g:79:1: entryRuleGreeting returns [Boolean current=false] : iv_ruleGreeting= ruleGreeting EOF ;
    public final Boolean entryRuleGreeting() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGreeting = null;


        try {
            // PsiInternalKobold.g:79:50: (iv_ruleGreeting= ruleGreeting EOF )
            // PsiInternalKobold.g:80:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getGreetingElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // PsiInternalKobold.g:86:1: ruleGreeting returns [Boolean current=false] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final Boolean ruleGreeting() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalKobold.g:87:1: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // PsiInternalKobold.g:88:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // PsiInternalKobold.g:88:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // PsiInternalKobold.g:89:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGreeting_HelloKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:96:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalKobold.g:97:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalKobold.g:97:4: (lv_name_1_0= RULE_ID )
            // PsiInternalKobold.g:98:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getGreeting_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGreeting_ExclamationMarkKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleXExpression"
    // PsiInternalKobold.g:124:1: entryRuleXExpression returns [Boolean current=false] : iv_ruleXExpression= ruleXExpression EOF ;
    public final Boolean entryRuleXExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXExpression = null;


        try {
            // PsiInternalKobold.g:124:53: (iv_ruleXExpression= ruleXExpression EOF )
            // PsiInternalKobold.g:125:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // PsiInternalKobold.g:131:1: ruleXExpression returns [Boolean current=false] : this_XAssignment_0= ruleXAssignment ;
    public final Boolean ruleXExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XAssignment_0 = null;


        try {
            // PsiInternalKobold.g:132:1: (this_XAssignment_0= ruleXAssignment )
            // PsiInternalKobold.g:133:2: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getXExpression_XAssignmentParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_XAssignment_0;
              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // PsiInternalKobold.g:144:1: entryRuleXAssignment returns [Boolean current=false] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final Boolean entryRuleXAssignment() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXAssignment = null;


        try {
            // PsiInternalKobold.g:144:53: (iv_ruleXAssignment= ruleXAssignment EOF )
            // PsiInternalKobold.g:145:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXAssignmentElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // PsiInternalKobold.g:151:1: ruleXAssignment returns [Boolean current=false] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final Boolean ruleXAssignment() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_3_0 = null;

        Boolean this_XOrExpression_4 = null;

        Boolean lv_rightOperand_7_0 = null;


        try {
            // PsiInternalKobold.g:152:1: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // PsiInternalKobold.g:153:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // PsiInternalKobold.g:153:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_DECIMAL)||LA3_1==14||(LA3_1>=16 && LA3_1<=56)||(LA3_1>=58 && LA3_1<=85)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15) ) {
                    alt3=1;
                }
                else if ( (LA3_2==EOF||(LA3_2>=RULE_ID && LA3_2<=RULE_DECIMAL)||LA3_2==14||(LA3_2>=16 && LA3_2<=56)||(LA3_2>=58 && LA3_2<=85)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==15) ) {
                    alt3=1;
                }
                else if ( (LA3_3==EOF||(LA3_3>=RULE_ID && LA3_3<=RULE_DECIMAL)||LA3_3==14||(LA3_3>=16 && LA3_3<=56)||(LA3_3>=58 && LA3_3<=85)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==EOF||(LA3_4>=RULE_ID && LA3_4<=RULE_DECIMAL)||LA3_4==14||(LA3_4>=16 && LA3_4<=56)||(LA3_4>=58 && LA3_4<=85)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==15) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==15) ) {
                    alt3=1;
                }
                else if ( (LA3_5==EOF||(LA3_5>=RULE_ID && LA3_5<=RULE_DECIMAL)||LA3_5==14||(LA3_5>=16 && LA3_5<=56)||(LA3_5>=58 && LA3_5<=85)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 14:
            case 21:
            case 37:
            case 38:
            case 50:
            case 52:
            case 53:
            case 55:
            case 59:
            case 61:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // PsiInternalKobold.g:154:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // PsiInternalKobold.g:154:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // PsiInternalKobold.g:155:4: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // PsiInternalKobold.g:155:4: ()
                    // PsiInternalKobold.g:156:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getXAssignment_XAssignmentAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalKobold.g:162:4: ( ( ruleFeatureCallID ) )
                    // PsiInternalKobold.g:163:5: ( ruleFeatureCallID )
                    {
                    // PsiInternalKobold.g:163:5: ( ruleFeatureCallID )
                    // PsiInternalKobold.g:164:6: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXAssignment_FeatureJvmIdentifiableElementCrossReference_0_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getXAssignment_OpSingleAssignParserRuleCall_0_2ElementType());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneComposite();
                      			
                    }
                    // PsiInternalKobold.g:186:4: ( (lv_value_3_0= ruleXAssignment ) )
                    // PsiInternalKobold.g:187:5: (lv_value_3_0= ruleXAssignment )
                    {
                    // PsiInternalKobold.g:187:5: (lv_value_3_0= ruleXAssignment )
                    // PsiInternalKobold.g:188:6: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXAssignment_ValueXAssignmentParserRuleCall_0_3_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:203:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // PsiInternalKobold.g:203:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // PsiInternalKobold.g:204:4: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getXAssignment_XOrExpressionParserRuleCall_1_0ElementType());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XOrExpression_4;
                      				doneComposite();
                      			
                    }
                    // PsiInternalKobold.g:212:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // PsiInternalKobold.g:213:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // PsiInternalKobold.g:213:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // PsiInternalKobold.g:214:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // PsiInternalKobold.g:224:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // PsiInternalKobold.g:225:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // PsiInternalKobold.g:225:7: ()
                            // PsiInternalKobold.g:226:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								precedeComposite(elementTypeProvider.getXAssignment_XBinaryOperationLeftOperandAction_1_1_0_0_0ElementType());
                              								doneComposite();
                              								associateWithSemanticElement();
                              							
                            }

                            }

                            // PsiInternalKobold.g:232:7: ( ( ruleOpMultiAssign ) )
                            // PsiInternalKobold.g:233:8: ( ruleOpMultiAssign )
                            {
                            // PsiInternalKobold.g:233:8: ( ruleOpMultiAssign )
                            // PsiInternalKobold.g:234:9: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              									if (!current) {
                              										associateWithSemanticElement();
                              										current = true;
                              									}
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									markComposite(elementTypeProvider.getXAssignment_FeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0ElementType());
                              								
                            }
                            pushFollow(FOLLOW_7);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									doneComposite();
                              								
                            }

                            }


                            }


                            }


                            }

                            // PsiInternalKobold.g:251:5: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // PsiInternalKobold.g:252:6: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // PsiInternalKobold.g:252:6: (lv_rightOperand_7_0= ruleXAssignment )
                            // PsiInternalKobold.g:253:7: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getXAssignment_RightOperandXAssignmentParserRuleCall_1_1_1_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // PsiInternalKobold.g:272:1: entryRuleOpSingleAssign returns [Boolean current=false] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final Boolean entryRuleOpSingleAssign() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpSingleAssign = null;


        try {
            // PsiInternalKobold.g:272:56: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // PsiInternalKobold.g:273:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpSingleAssignElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // PsiInternalKobold.g:279:1: ruleOpSingleAssign returns [Boolean current=false] : kw= '=' ;
    public final Boolean ruleOpSingleAssign() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:280:1: (kw= '=' )
            // PsiInternalKobold.g:281:2: kw= '='
            {
            if ( state.backtracking==0 ) {

              		markLeaf(elementTypeProvider.getOpSingleAssign_EqualsSignKeywordElementType());
              	
            }
            kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneLeaf(kw);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // PsiInternalKobold.g:291:1: entryRuleOpMultiAssign returns [Boolean current=false] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final Boolean entryRuleOpMultiAssign() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpMultiAssign = null;


        try {
            // PsiInternalKobold.g:291:55: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // PsiInternalKobold.g:292:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpMultiAssignElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // PsiInternalKobold.g:298:1: ruleOpMultiAssign returns [Boolean current=false] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) ;
    public final Boolean ruleOpMultiAssign() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:299:1: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) )
            // PsiInternalKobold.g:300:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            {
            // PsiInternalKobold.g:300:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 22:
                {
                alt5=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // PsiInternalKobold.g:301:3: kw= '+='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMultiAssign_PlusSignEqualsSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:309:3: kw= '-='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMultiAssign_HyphenMinusEqualsSignKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:317:3: kw= '*='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMultiAssign_AsteriskEqualsSignKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:325:3: kw= '/='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMultiAssign_SolidusEqualsSignKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalKobold.g:333:3: kw= '%='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMultiAssign_PercentSignEqualsSignKeyword_4ElementType());
                      		
                    }
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalKobold.g:341:3: (kw= '<' kw= '<' kw= '=' )
                    {
                    // PsiInternalKobold.g:341:3: (kw= '<' kw= '<' kw= '=' )
                    // PsiInternalKobold.g:342:4: kw= '<' kw= '<' kw= '='
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpMultiAssign_LessThanSignKeyword_5_0ElementType());
                      			
                    }
                    kw=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpMultiAssign_LessThanSignKeyword_5_1ElementType());
                      			
                    }
                    kw=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpMultiAssign_EqualsSignKeyword_5_2ElementType());
                      			
                    }
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // PsiInternalKobold.g:365:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    {
                    // PsiInternalKobold.g:365:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    // PsiInternalKobold.g:366:4: kw= '>' (kw= '>' )? kw= '>='
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpMultiAssign_GreaterThanSignKeyword_6_0ElementType());
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    // PsiInternalKobold.g:373:4: (kw= '>' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==22) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // PsiInternalKobold.g:374:5: kw= '>'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getOpMultiAssign_GreaterThanSignKeyword_6_1ElementType());
                              				
                            }
                            kw=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(kw);
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpMultiAssign_GreaterThanSignEqualsSignKeyword_6_2ElementType());
                      			
                    }
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // PsiInternalKobold.g:394:1: entryRuleXOrExpression returns [Boolean current=false] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final Boolean entryRuleXOrExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXOrExpression = null;


        try {
            // PsiInternalKobold.g:394:55: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // PsiInternalKobold.g:395:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXOrExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // PsiInternalKobold.g:401:1: ruleXOrExpression returns [Boolean current=false] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final Boolean ruleXOrExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XAndExpression_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:402:1: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // PsiInternalKobold.g:403:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // PsiInternalKobold.g:403:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // PsiInternalKobold.g:404:3: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXOrExpression_XAndExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_12);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAndExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:412:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_PsiInternalKobold()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalKobold.g:413:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // PsiInternalKobold.g:413:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // PsiInternalKobold.g:414:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // PsiInternalKobold.g:424:5: ( () ( ( ruleOpOr ) ) )
            	    // PsiInternalKobold.g:425:6: () ( ( ruleOpOr ) )
            	    {
            	    // PsiInternalKobold.g:425:6: ()
            	    // PsiInternalKobold.g:426:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXOrExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:432:6: ( ( ruleOpOr ) )
            	    // PsiInternalKobold.g:433:7: ( ruleOpOr )
            	    {
            	    // PsiInternalKobold.g:433:7: ( ruleOpOr )
            	    // PsiInternalKobold.g:434:8: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXOrExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:451:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // PsiInternalKobold.g:452:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // PsiInternalKobold.g:452:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // PsiInternalKobold.g:453:6: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXOrExpression_RightOperandXAndExpressionParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // PsiInternalKobold.g:471:1: entryRuleOpOr returns [Boolean current=false] : iv_ruleOpOr= ruleOpOr EOF ;
    public final Boolean entryRuleOpOr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpOr = null;


        try {
            // PsiInternalKobold.g:471:46: (iv_ruleOpOr= ruleOpOr EOF )
            // PsiInternalKobold.g:472:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpOrElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // PsiInternalKobold.g:478:1: ruleOpOr returns [Boolean current=false] : kw= '||' ;
    public final Boolean ruleOpOr() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:479:1: (kw= '||' )
            // PsiInternalKobold.g:480:2: kw= '||'
            {
            if ( state.backtracking==0 ) {

              		markLeaf(elementTypeProvider.getOpOr_VerticalLineVerticalLineKeywordElementType());
              	
            }
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneLeaf(kw);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // PsiInternalKobold.g:490:1: entryRuleXAndExpression returns [Boolean current=false] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final Boolean entryRuleXAndExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXAndExpression = null;


        try {
            // PsiInternalKobold.g:490:56: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // PsiInternalKobold.g:491:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXAndExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // PsiInternalKobold.g:497:1: ruleXAndExpression returns [Boolean current=false] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final Boolean ruleXAndExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XEqualityExpression_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:498:1: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // PsiInternalKobold.g:499:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // PsiInternalKobold.g:499:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // PsiInternalKobold.g:500:3: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXAndExpression_XEqualityExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_13);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XEqualityExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:508:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_PsiInternalKobold()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // PsiInternalKobold.g:509:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // PsiInternalKobold.g:509:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // PsiInternalKobold.g:510:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // PsiInternalKobold.g:520:5: ( () ( ( ruleOpAnd ) ) )
            	    // PsiInternalKobold.g:521:6: () ( ( ruleOpAnd ) )
            	    {
            	    // PsiInternalKobold.g:521:6: ()
            	    // PsiInternalKobold.g:522:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXAndExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:528:6: ( ( ruleOpAnd ) )
            	    // PsiInternalKobold.g:529:7: ( ruleOpAnd )
            	    {
            	    // PsiInternalKobold.g:529:7: ( ruleOpAnd )
            	    // PsiInternalKobold.g:530:8: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXAndExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:547:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // PsiInternalKobold.g:548:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // PsiInternalKobold.g:548:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // PsiInternalKobold.g:549:6: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXAndExpression_RightOperandXEqualityExpressionParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // PsiInternalKobold.g:567:1: entryRuleOpAnd returns [Boolean current=false] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final Boolean entryRuleOpAnd() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpAnd = null;


        try {
            // PsiInternalKobold.g:567:47: (iv_ruleOpAnd= ruleOpAnd EOF )
            // PsiInternalKobold.g:568:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpAndElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // PsiInternalKobold.g:574:1: ruleOpAnd returns [Boolean current=false] : kw= '&&' ;
    public final Boolean ruleOpAnd() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:575:1: (kw= '&&' )
            // PsiInternalKobold.g:576:2: kw= '&&'
            {
            if ( state.backtracking==0 ) {

              		markLeaf(elementTypeProvider.getOpAnd_AmpersandAmpersandKeywordElementType());
              	
            }
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneLeaf(kw);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // PsiInternalKobold.g:586:1: entryRuleXEqualityExpression returns [Boolean current=false] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final Boolean entryRuleXEqualityExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXEqualityExpression = null;


        try {
            // PsiInternalKobold.g:586:61: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // PsiInternalKobold.g:587:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXEqualityExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // PsiInternalKobold.g:593:1: ruleXEqualityExpression returns [Boolean current=false] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final Boolean ruleXEqualityExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XRelationalExpression_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:594:1: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // PsiInternalKobold.g:595:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // PsiInternalKobold.g:595:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // PsiInternalKobold.g:596:3: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXEqualityExpression_XRelationalExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_14);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XRelationalExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:604:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_PsiInternalKobold()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_PsiInternalKobold()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred4_PsiInternalKobold()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred4_PsiInternalKobold()) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // PsiInternalKobold.g:605:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // PsiInternalKobold.g:605:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // PsiInternalKobold.g:606:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // PsiInternalKobold.g:616:5: ( () ( ( ruleOpEquality ) ) )
            	    // PsiInternalKobold.g:617:6: () ( ( ruleOpEquality ) )
            	    {
            	    // PsiInternalKobold.g:617:6: ()
            	    // PsiInternalKobold.g:618:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXEqualityExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:624:6: ( ( ruleOpEquality ) )
            	    // PsiInternalKobold.g:625:7: ( ruleOpEquality )
            	    {
            	    // PsiInternalKobold.g:625:7: ( ruleOpEquality )
            	    // PsiInternalKobold.g:626:8: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXEqualityExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:643:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // PsiInternalKobold.g:644:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // PsiInternalKobold.g:644:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // PsiInternalKobold.g:645:6: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXEqualityExpression_RightOperandXRelationalExpressionParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // PsiInternalKobold.g:663:1: entryRuleOpEquality returns [Boolean current=false] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final Boolean entryRuleOpEquality() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpEquality = null;


        try {
            // PsiInternalKobold.g:663:52: (iv_ruleOpEquality= ruleOpEquality EOF )
            // PsiInternalKobold.g:664:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpEqualityElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // PsiInternalKobold.g:670:1: ruleOpEquality returns [Boolean current=false] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final Boolean ruleOpEquality() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:671:1: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // PsiInternalKobold.g:672:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // PsiInternalKobold.g:672:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // PsiInternalKobold.g:673:3: kw= '=='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpEquality_EqualsSignEqualsSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:681:3: kw= '!='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpEquality_ExclamationMarkEqualsSignKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:689:3: kw= '==='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpEquality_EqualsSignEqualsSignEqualsSignKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:697:3: kw= '!=='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpEquality_ExclamationMarkEqualsSignEqualsSignKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // PsiInternalKobold.g:708:1: entryRuleXRelationalExpression returns [Boolean current=false] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final Boolean entryRuleXRelationalExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXRelationalExpression = null;


        try {
            // PsiInternalKobold.g:708:63: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // PsiInternalKobold.g:709:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXRelationalExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // PsiInternalKobold.g:715:1: ruleXRelationalExpression returns [Boolean current=false] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final Boolean ruleXRelationalExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_XOtherOperatorExpression_0 = null;

        Boolean lv_type_3_0 = null;

        Boolean lv_rightOperand_6_0 = null;


        try {
            // PsiInternalKobold.g:716:1: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // PsiInternalKobold.g:717:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // PsiInternalKobold.g:717:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // PsiInternalKobold.g:718:3: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXRelationalExpression_XOtherOperatorExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_15);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XOtherOperatorExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:726:3: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_PsiInternalKobold()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_PsiInternalKobold()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred5_PsiInternalKobold()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_PsiInternalKobold()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // PsiInternalKobold.g:727:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // PsiInternalKobold.g:727:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // PsiInternalKobold.g:728:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // PsiInternalKobold.g:728:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // PsiInternalKobold.g:729:6: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // PsiInternalKobold.g:735:6: ( () otherlv_2= 'instanceof' )
            	    // PsiInternalKobold.g:736:7: () otherlv_2= 'instanceof'
            	    {
            	    // PsiInternalKobold.g:736:7: ()
            	    // PsiInternalKobold.g:737:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								precedeComposite(elementTypeProvider.getXRelationalExpression_XInstanceOfExpressionExpressionAction_1_0_0_0_0ElementType());
            	      								doneComposite();
            	      								associateWithSemanticElement();
            	      							
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      							markLeaf(elementTypeProvider.getXRelationalExpression_InstanceofKeyword_1_0_0_0_1ElementType());
            	      						
            	    }
            	    otherlv_2=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneLeaf(otherlv_2);
            	      						
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:752:5: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // PsiInternalKobold.g:753:6: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // PsiInternalKobold.g:753:6: (lv_type_3_0= ruleJvmTypeReference )
            	    // PsiInternalKobold.g:754:7: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      							markComposite(elementTypeProvider.getXRelationalExpression_TypeJvmTypeReferenceParserRuleCall_1_0_1_0ElementType());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneComposite();
            	      							if(!current) {
            	      								associateWithSemanticElement();
            	      								current = true;
            	      							}
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalKobold.g:769:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // PsiInternalKobold.g:769:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // PsiInternalKobold.g:770:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // PsiInternalKobold.g:770:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // PsiInternalKobold.g:771:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // PsiInternalKobold.g:781:6: ( () ( ( ruleOpCompare ) ) )
            	    // PsiInternalKobold.g:782:7: () ( ( ruleOpCompare ) )
            	    {
            	    // PsiInternalKobold.g:782:7: ()
            	    // PsiInternalKobold.g:783:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								precedeComposite(elementTypeProvider.getXRelationalExpression_XBinaryOperationLeftOperandAction_1_1_0_0_0ElementType());
            	      								doneComposite();
            	      								associateWithSemanticElement();
            	      							
            	    }

            	    }

            	    // PsiInternalKobold.g:789:7: ( ( ruleOpCompare ) )
            	    // PsiInternalKobold.g:790:8: ( ruleOpCompare )
            	    {
            	    // PsiInternalKobold.g:790:8: ( ruleOpCompare )
            	    // PsiInternalKobold.g:791:9: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (!current) {
            	      										associateWithSemanticElement();
            	      										current = true;
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									markComposite(elementTypeProvider.getXRelationalExpression_FeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0ElementType());
            	      								
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									doneComposite();
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:808:5: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // PsiInternalKobold.g:809:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // PsiInternalKobold.g:809:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // PsiInternalKobold.g:810:7: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							markComposite(elementTypeProvider.getXRelationalExpression_RightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0ElementType());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneComposite();
            	      							if(!current) {
            	      								associateWithSemanticElement();
            	      								current = true;
            	      							}
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // PsiInternalKobold.g:829:1: entryRuleOpCompare returns [Boolean current=false] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final Boolean entryRuleOpCompare() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpCompare = null;


        try {
            // PsiInternalKobold.g:829:51: (iv_ruleOpCompare= ruleOpCompare EOF )
            // PsiInternalKobold.g:830:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpCompareElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // PsiInternalKobold.g:836:1: ruleOpCompare returns [Boolean current=false] : (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) ;
    public final Boolean ruleOpCompare() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:837:1: ( (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) )
            // PsiInternalKobold.g:838:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            {
            // PsiInternalKobold.g:838:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==15) ) {
                    alt11=2;
                }
                else if ( (LA11_2==EOF||(LA11_2>=RULE_ID && LA11_2<=RULE_DECIMAL)||LA11_2==14||LA11_2==21||(LA11_2>=37 && LA11_2<=38)||LA11_2==50||(LA11_2>=52 && LA11_2<=53)||LA11_2==55||LA11_2==59||LA11_2==61||(LA11_2>=65 && LA11_2<=67)||(LA11_2>=70 && LA11_2<=82)||LA11_2==84) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // PsiInternalKobold.g:839:3: kw= '>='
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpCompare_GreaterThanSignEqualsSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:847:3: (kw= '<' kw= '=' )
                    {
                    // PsiInternalKobold.g:847:3: (kw= '<' kw= '=' )
                    // PsiInternalKobold.g:848:4: kw= '<' kw= '='
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpCompare_LessThanSignKeyword_1_0ElementType());
                      			
                    }
                    kw=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpCompare_EqualsSignKeyword_1_1ElementType());
                      			
                    }
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:864:3: kw= '>'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpCompare_GreaterThanSignKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:872:3: kw= '<'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpCompare_LessThanSignKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // PsiInternalKobold.g:883:1: entryRuleXOtherOperatorExpression returns [Boolean current=false] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final Boolean entryRuleXOtherOperatorExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXOtherOperatorExpression = null;


        try {
            // PsiInternalKobold.g:883:66: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // PsiInternalKobold.g:884:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXOtherOperatorExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // PsiInternalKobold.g:890:1: ruleXOtherOperatorExpression returns [Boolean current=false] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final Boolean ruleXOtherOperatorExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XAdditiveExpression_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:891:1: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // PsiInternalKobold.g:892:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // PsiInternalKobold.g:892:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // PsiInternalKobold.g:893:3: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXOtherOperatorExpression_XAdditiveExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_17);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAdditiveExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:901:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // PsiInternalKobold.g:902:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // PsiInternalKobold.g:902:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // PsiInternalKobold.g:903:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // PsiInternalKobold.g:913:5: ( () ( ( ruleOpOther ) ) )
            	    // PsiInternalKobold.g:914:6: () ( ( ruleOpOther ) )
            	    {
            	    // PsiInternalKobold.g:914:6: ()
            	    // PsiInternalKobold.g:915:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXOtherOperatorExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:921:6: ( ( ruleOpOther ) )
            	    // PsiInternalKobold.g:922:7: ( ruleOpOther )
            	    {
            	    // PsiInternalKobold.g:922:7: ( ruleOpOther )
            	    // PsiInternalKobold.g:923:8: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXOtherOperatorExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:940:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // PsiInternalKobold.g:941:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // PsiInternalKobold.g:941:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // PsiInternalKobold.g:942:6: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXOtherOperatorExpression_RightOperandXAdditiveExpressionParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // PsiInternalKobold.g:960:1: entryRuleOpOther returns [Boolean current=false] : iv_ruleOpOther= ruleOpOther EOF ;
    public final Boolean entryRuleOpOther() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpOther = null;


        try {
            // PsiInternalKobold.g:960:49: (iv_ruleOpOther= ruleOpOther EOF )
            // PsiInternalKobold.g:961:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpOtherElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // PsiInternalKobold.g:967:1: ruleOpOther returns [Boolean current=false] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) ;
    public final Boolean ruleOpOther() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:968:1: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) )
            // PsiInternalKobold.g:969:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            {
            // PsiInternalKobold.g:969:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // PsiInternalKobold.g:970:3: kw= '->'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_HyphenMinusGreaterThanSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:978:3: kw= '..<'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_FullStopFullStopLessThanSignKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:986:3: (kw= '>' kw= '..' )
                    {
                    // PsiInternalKobold.g:986:3: (kw= '>' kw= '..' )
                    // PsiInternalKobold.g:987:4: kw= '>' kw= '..'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpOther_GreaterThanSignKeyword_2_0ElementType());
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpOther_FullStopFullStopKeyword_2_1ElementType());
                      			
                    }
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:1003:3: kw= '..'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_FullStopFullStopKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalKobold.g:1011:3: kw= '=>'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_EqualsSignGreaterThanSignKeyword_4ElementType());
                      		
                    }
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalKobold.g:1019:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // PsiInternalKobold.g:1019:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // PsiInternalKobold.g:1020:4: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpOther_GreaterThanSignKeyword_5_0ElementType());
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    // PsiInternalKobold.g:1027:4: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||LA13_1==14||LA13_1==21||(LA13_1>=37 && LA13_1<=38)||LA13_1==50||(LA13_1>=52 && LA13_1<=53)||LA13_1==55||LA13_1==59||LA13_1==61||(LA13_1>=65 && LA13_1<=67)||(LA13_1>=70 && LA13_1<=82)||LA13_1==84) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==22) && (synpred8_PsiInternalKobold())) {
                            alt13=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // PsiInternalKobold.g:1028:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // PsiInternalKobold.g:1028:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // PsiInternalKobold.g:1029:6: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // PsiInternalKobold.g:1034:6: (kw= '>' kw= '>' )
                            // PsiInternalKobold.g:1035:7: kw= '>' kw= '>'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getOpOther_GreaterThanSignKeyword_5_1_0_0_0ElementType());
                              						
                            }
                            kw=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(kw);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getOpOther_GreaterThanSignKeyword_5_1_0_0_1ElementType());
                              						
                            }
                            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(kw);
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:1052:5: kw= '>'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getOpOther_GreaterThanSignKeyword_5_1_1ElementType());
                              				
                            }
                            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(kw);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // PsiInternalKobold.g:1062:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    {
                    // PsiInternalKobold.g:1062:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    // PsiInternalKobold.g:1063:4: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getOpOther_LessThanSignKeyword_6_0ElementType());
                      			
                    }
                    kw=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    // PsiInternalKobold.g:1070:4: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==21) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_PsiInternalKobold()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA14_0==34) ) {
                        alt14=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // PsiInternalKobold.g:1071:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // PsiInternalKobold.g:1071:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // PsiInternalKobold.g:1072:6: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // PsiInternalKobold.g:1077:6: (kw= '<' kw= '<' )
                            // PsiInternalKobold.g:1078:7: kw= '<' kw= '<'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getOpOther_LessThanSignKeyword_6_1_0_0_0ElementType());
                              						
                            }
                            kw=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(kw);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getOpOther_LessThanSignKeyword_6_1_0_0_1ElementType());
                              						
                            }
                            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(kw);
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:1095:5: kw= '<'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getOpOther_LessThanSignKeyword_6_1_1ElementType());
                              				
                            }
                            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(kw);
                              				
                            }

                            }
                            break;
                        case 3 :
                            // PsiInternalKobold.g:1103:5: kw= '=>'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getOpOther_EqualsSignGreaterThanSignKeyword_6_1_2ElementType());
                              				
                            }
                            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(kw);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // PsiInternalKobold.g:1113:3: kw= '<>'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_LessThanSignGreaterThanSignKeyword_7ElementType());
                      		
                    }
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 9 :
                    // PsiInternalKobold.g:1121:3: kw= '?:'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpOther_QuestionMarkColonKeyword_8ElementType());
                      		
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // PsiInternalKobold.g:1132:1: entryRuleXAdditiveExpression returns [Boolean current=false] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final Boolean entryRuleXAdditiveExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXAdditiveExpression = null;


        try {
            // PsiInternalKobold.g:1132:61: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // PsiInternalKobold.g:1133:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXAdditiveExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // PsiInternalKobold.g:1139:1: ruleXAdditiveExpression returns [Boolean current=false] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final Boolean ruleXAdditiveExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XMultiplicativeExpression_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:1140:1: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // PsiInternalKobold.g:1141:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // PsiInternalKobold.g:1141:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // PsiInternalKobold.g:1142:3: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXAdditiveExpression_XMultiplicativeExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_21);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMultiplicativeExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:1150:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_PsiInternalKobold()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==38) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_PsiInternalKobold()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // PsiInternalKobold.g:1151:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // PsiInternalKobold.g:1151:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // PsiInternalKobold.g:1152:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // PsiInternalKobold.g:1162:5: ( () ( ( ruleOpAdd ) ) )
            	    // PsiInternalKobold.g:1163:6: () ( ( ruleOpAdd ) )
            	    {
            	    // PsiInternalKobold.g:1163:6: ()
            	    // PsiInternalKobold.g:1164:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXAdditiveExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:1170:6: ( ( ruleOpAdd ) )
            	    // PsiInternalKobold.g:1171:7: ( ruleOpAdd )
            	    {
            	    // PsiInternalKobold.g:1171:7: ( ruleOpAdd )
            	    // PsiInternalKobold.g:1172:8: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXAdditiveExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:1189:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // PsiInternalKobold.g:1190:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // PsiInternalKobold.g:1190:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // PsiInternalKobold.g:1191:6: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXAdditiveExpression_RightOperandXMultiplicativeExpressionParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // PsiInternalKobold.g:1209:1: entryRuleOpAdd returns [Boolean current=false] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final Boolean entryRuleOpAdd() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpAdd = null;


        try {
            // PsiInternalKobold.g:1209:47: (iv_ruleOpAdd= ruleOpAdd EOF )
            // PsiInternalKobold.g:1210:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpAddElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // PsiInternalKobold.g:1216:1: ruleOpAdd returns [Boolean current=false] : (kw= '+' | kw= '-' ) ;
    public final Boolean ruleOpAdd() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:1217:1: ( (kw= '+' | kw= '-' ) )
            // PsiInternalKobold.g:1218:2: (kw= '+' | kw= '-' )
            {
            // PsiInternalKobold.g:1218:2: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalKobold.g:1219:3: kw= '+'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpAdd_PlusSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:1227:3: kw= '-'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpAdd_HyphenMinusKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // PsiInternalKobold.g:1238:1: entryRuleXMultiplicativeExpression returns [Boolean current=false] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final Boolean entryRuleXMultiplicativeExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXMultiplicativeExpression = null;


        try {
            // PsiInternalKobold.g:1238:67: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // PsiInternalKobold.g:1239:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXMultiplicativeExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // PsiInternalKobold.g:1245:1: ruleXMultiplicativeExpression returns [Boolean current=false] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final Boolean ruleXMultiplicativeExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XUnaryOperation_0 = null;

        Boolean lv_rightOperand_3_0 = null;


        try {
            // PsiInternalKobold.g:1246:1: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // PsiInternalKobold.g:1247:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // PsiInternalKobold.g:1247:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // PsiInternalKobold.g:1248:3: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXMultiplicativeExpression_XUnaryOperationParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_22);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XUnaryOperation_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:1256:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_PsiInternalKobold()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_PsiInternalKobold()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_PsiInternalKobold()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_PsiInternalKobold()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // PsiInternalKobold.g:1257:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // PsiInternalKobold.g:1257:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // PsiInternalKobold.g:1258:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // PsiInternalKobold.g:1268:5: ( () ( ( ruleOpMulti ) ) )
            	    // PsiInternalKobold.g:1269:6: () ( ( ruleOpMulti ) )
            	    {
            	    // PsiInternalKobold.g:1269:6: ()
            	    // PsiInternalKobold.g:1270:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXMultiplicativeExpression_XBinaryOperationLeftOperandAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    // PsiInternalKobold.g:1276:6: ( ( ruleOpMulti ) )
            	    // PsiInternalKobold.g:1277:7: ( ruleOpMulti )
            	    {
            	    // PsiInternalKobold.g:1277:7: ( ruleOpMulti )
            	    // PsiInternalKobold.g:1278:8: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (!current) {
            	      									associateWithSemanticElement();
            	      									current = true;
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								markComposite(elementTypeProvider.getXMultiplicativeExpression_FeatureJvmIdentifiableElementCrossReference_1_0_0_1_0ElementType());
            	      							
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								doneComposite();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:1295:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // PsiInternalKobold.g:1296:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // PsiInternalKobold.g:1296:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // PsiInternalKobold.g:1297:6: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXMultiplicativeExpression_RightOperandXUnaryOperationParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // PsiInternalKobold.g:1315:1: entryRuleOpMulti returns [Boolean current=false] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final Boolean entryRuleOpMulti() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpMulti = null;


        try {
            // PsiInternalKobold.g:1315:49: (iv_ruleOpMulti= ruleOpMulti EOF )
            // PsiInternalKobold.g:1316:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpMultiElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // PsiInternalKobold.g:1322:1: ruleOpMulti returns [Boolean current=false] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final Boolean ruleOpMulti() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:1323:1: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // PsiInternalKobold.g:1324:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // PsiInternalKobold.g:1324:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            case 42:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // PsiInternalKobold.g:1325:3: kw= '*'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMulti_AsteriskKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:1333:3: kw= '**'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMulti_AsteriskAsteriskKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:1341:3: kw= '/'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMulti_SolidusKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:1349:3: kw= '%'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpMulti_PercentSignKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // PsiInternalKobold.g:1360:1: entryRuleXUnaryOperation returns [Boolean current=false] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final Boolean entryRuleXUnaryOperation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXUnaryOperation = null;


        try {
            // PsiInternalKobold.g:1360:57: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // PsiInternalKobold.g:1361:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXUnaryOperationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // PsiInternalKobold.g:1367:1: ruleXUnaryOperation returns [Boolean current=false] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final Boolean ruleXUnaryOperation() throws RecognitionException {
        Boolean current = false;

        Boolean lv_operand_2_0 = null;

        Boolean this_XCastedExpression_3 = null;


        try {
            // PsiInternalKobold.g:1368:1: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // PsiInternalKobold.g:1369:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // PsiInternalKobold.g:1369:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14||(LA20_0>=37 && LA20_0<=38)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DECIMAL)||LA20_0==21||LA20_0==50||(LA20_0>=52 && LA20_0<=53)||LA20_0==55||LA20_0==59||LA20_0==61||(LA20_0>=65 && LA20_0<=67)||(LA20_0>=70 && LA20_0<=82)||LA20_0==84) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalKobold.g:1370:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // PsiInternalKobold.g:1370:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // PsiInternalKobold.g:1371:4: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // PsiInternalKobold.g:1371:4: ()
                    // PsiInternalKobold.g:1372:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getXUnaryOperation_XUnaryOperationAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalKobold.g:1378:4: ( ( ruleOpUnary ) )
                    // PsiInternalKobold.g:1379:5: ( ruleOpUnary )
                    {
                    // PsiInternalKobold.g:1379:5: ( ruleOpUnary )
                    // PsiInternalKobold.g:1380:6: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXUnaryOperation_FeatureJvmIdentifiableElementCrossReference_0_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:1395:4: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // PsiInternalKobold.g:1396:5: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // PsiInternalKobold.g:1396:5: (lv_operand_2_0= ruleXUnaryOperation )
                    // PsiInternalKobold.g:1397:6: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXUnaryOperation_OperandXUnaryOperationParserRuleCall_0_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:1412:3: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXUnaryOperation_XCastedExpressionParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCastedExpression_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // PsiInternalKobold.g:1424:1: entryRuleOpUnary returns [Boolean current=false] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final Boolean entryRuleOpUnary() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpUnary = null;


        try {
            // PsiInternalKobold.g:1424:49: (iv_ruleOpUnary= ruleOpUnary EOF )
            // PsiInternalKobold.g:1425:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpUnaryElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // PsiInternalKobold.g:1431:1: ruleOpUnary returns [Boolean current=false] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final Boolean ruleOpUnary() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:1432:1: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // PsiInternalKobold.g:1433:2: (kw= '!' | kw= '-' | kw= '+' )
            {
            // PsiInternalKobold.g:1433:2: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // PsiInternalKobold.g:1434:3: kw= '!'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpUnary_ExclamationMarkKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:1442:3: kw= '-'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpUnary_HyphenMinusKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:1450:3: kw= '+'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpUnary_PlusSignKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // PsiInternalKobold.g:1461:1: entryRuleXCastedExpression returns [Boolean current=false] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final Boolean entryRuleXCastedExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXCastedExpression = null;


        try {
            // PsiInternalKobold.g:1461:59: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // PsiInternalKobold.g:1462:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXCastedExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // PsiInternalKobold.g:1468:1: ruleXCastedExpression returns [Boolean current=false] : (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final Boolean ruleXCastedExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_XPostfixOperation_0 = null;

        Boolean lv_type_3_0 = null;


        try {
            // PsiInternalKobold.g:1469:1: ( (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // PsiInternalKobold.g:1470:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // PsiInternalKobold.g:1470:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // PsiInternalKobold.g:1471:3: this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXCastedExpression_XPostfixOperationParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_23);
            this_XPostfixOperation_0=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPostfixOperation_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:1479:3: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_PsiInternalKobold()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // PsiInternalKobold.g:1480:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // PsiInternalKobold.g:1480:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // PsiInternalKobold.g:1481:5: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // PsiInternalKobold.g:1487:5: ( () otherlv_2= 'as' )
            	    // PsiInternalKobold.g:1488:6: () otherlv_2= 'as'
            	    {
            	    // PsiInternalKobold.g:1488:6: ()
            	    // PsiInternalKobold.g:1489:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							precedeComposite(elementTypeProvider.getXCastedExpression_XCastedExpressionTargetAction_1_0_0_0ElementType());
            	      							doneComposite();
            	      							associateWithSemanticElement();
            	      						
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      						markLeaf(elementTypeProvider.getXCastedExpression_AsKeyword_1_0_0_1ElementType());
            	      					
            	    }
            	    otherlv_2=(Token)match(input,43,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneLeaf(otherlv_2);
            	      					
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:1504:4: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // PsiInternalKobold.g:1505:5: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // PsiInternalKobold.g:1505:5: (lv_type_3_0= ruleJvmTypeReference )
            	    // PsiInternalKobold.g:1506:6: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXCastedExpression_TypeJvmTypeReferenceParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXPostfixOperation"
    // PsiInternalKobold.g:1524:1: entryRuleXPostfixOperation returns [Boolean current=false] : iv_ruleXPostfixOperation= ruleXPostfixOperation EOF ;
    public final Boolean entryRuleXPostfixOperation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXPostfixOperation = null;


        try {
            // PsiInternalKobold.g:1524:59: (iv_ruleXPostfixOperation= ruleXPostfixOperation EOF )
            // PsiInternalKobold.g:1525:2: iv_ruleXPostfixOperation= ruleXPostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXPostfixOperationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPostfixOperation=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPostfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPostfixOperation"


    // $ANTLR start "ruleXPostfixOperation"
    // PsiInternalKobold.g:1531:1: ruleXPostfixOperation returns [Boolean current=false] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) ;
    public final Boolean ruleXPostfixOperation() throws RecognitionException {
        Boolean current = false;

        Boolean this_XMemberFeatureCall_0 = null;


        try {
            // PsiInternalKobold.g:1532:1: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) )
            // PsiInternalKobold.g:1533:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            {
            // PsiInternalKobold.g:1533:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            // PsiInternalKobold.g:1534:3: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXPostfixOperation_XMemberFeatureCallParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_24);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMemberFeatureCall_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:1542:3: ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred13_PsiInternalKobold()) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==45) ) {
                int LA23_2 = input.LA(2);

                if ( (synpred13_PsiInternalKobold()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalKobold.g:1543:4: ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) )
                    {
                    // PsiInternalKobold.g:1553:4: ( () ( ( ruleOpPostfix ) ) )
                    // PsiInternalKobold.g:1554:5: () ( ( ruleOpPostfix ) )
                    {
                    // PsiInternalKobold.g:1554:5: ()
                    // PsiInternalKobold.g:1555:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						precedeComposite(elementTypeProvider.getXPostfixOperation_XPostfixOperationOperandAction_1_0_0ElementType());
                      						doneComposite();
                      						associateWithSemanticElement();
                      					
                    }

                    }

                    // PsiInternalKobold.g:1561:5: ( ( ruleOpPostfix ) )
                    // PsiInternalKobold.g:1562:6: ( ruleOpPostfix )
                    {
                    // PsiInternalKobold.g:1562:6: ( ruleOpPostfix )
                    // PsiInternalKobold.g:1563:7: ruleOpPostfix
                    {
                    if ( state.backtracking==0 ) {

                      							if (!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXPostfixOperation_FeatureJvmIdentifiableElementCrossReference_1_0_1_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPostfixOperation"


    // $ANTLR start "entryRuleOpPostfix"
    // PsiInternalKobold.g:1584:1: entryRuleOpPostfix returns [Boolean current=false] : iv_ruleOpPostfix= ruleOpPostfix EOF ;
    public final Boolean entryRuleOpPostfix() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOpPostfix = null;


        try {
            // PsiInternalKobold.g:1584:51: (iv_ruleOpPostfix= ruleOpPostfix EOF )
            // PsiInternalKobold.g:1585:2: iv_ruleOpPostfix= ruleOpPostfix EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getOpPostfixElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpPostfix=ruleOpPostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpPostfix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpPostfix"


    // $ANTLR start "ruleOpPostfix"
    // PsiInternalKobold.g:1591:1: ruleOpPostfix returns [Boolean current=false] : (kw= '++' | kw= '--' ) ;
    public final Boolean ruleOpPostfix() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:1592:1: ( (kw= '++' | kw= '--' ) )
            // PsiInternalKobold.g:1593:2: (kw= '++' | kw= '--' )
            {
            // PsiInternalKobold.g:1593:2: (kw= '++' | kw= '--' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalKobold.g:1594:3: kw= '++'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpPostfix_PlusSignPlusSignKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:1602:3: kw= '--'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getOpPostfix_HyphenMinusHyphenMinusKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpPostfix"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // PsiInternalKobold.g:1613:1: entryRuleXMemberFeatureCall returns [Boolean current=false] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final Boolean entryRuleXMemberFeatureCall() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXMemberFeatureCall = null;


        try {
            // PsiInternalKobold.g:1613:60: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // PsiInternalKobold.g:1614:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXMemberFeatureCallElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // PsiInternalKobold.g:1620:1: ruleXMemberFeatureCall returns [Boolean current=false] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
    public final Boolean ruleXMemberFeatureCall() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token lv_explicitStatic_3_0=null;
        Token otherlv_8=null;
        Token lv_nullSafe_9_0=null;
        Token lv_explicitStatic_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_17_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Boolean this_XPrimaryExpression_0 = null;

        Boolean lv_value_6_0 = null;

        Boolean lv_typeArguments_12_0 = null;

        Boolean lv_typeArguments_14_0 = null;

        Boolean lv_memberCallArguments_18_0 = null;

        Boolean lv_memberCallArguments_19_0 = null;

        Boolean lv_memberCallArguments_21_0 = null;

        Boolean lv_memberCallArguments_23_0 = null;


        try {
            // PsiInternalKobold.g:1621:1: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // PsiInternalKobold.g:1622:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // PsiInternalKobold.g:1622:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // PsiInternalKobold.g:1623:3: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXMemberFeatureCall_XPrimaryExpressionParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_25);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPrimaryExpression_0;
              			doneComposite();
              		
            }
            // PsiInternalKobold.g:1631:3: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred14_PsiInternalKobold()) ) {
                        alt33=1;
                    }
                    else if ( (synpred15_PsiInternalKobold()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred14_PsiInternalKobold()) ) {
                        alt33=1;
                    }
                    else if ( (synpred15_PsiInternalKobold()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred15_PsiInternalKobold()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // PsiInternalKobold.g:1632:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // PsiInternalKobold.g:1632:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // PsiInternalKobold.g:1633:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // PsiInternalKobold.g:1633:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // PsiInternalKobold.g:1634:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // PsiInternalKobold.g:1654:6: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // PsiInternalKobold.g:1655:7: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // PsiInternalKobold.g:1655:7: ()
            	    // PsiInternalKobold.g:1656:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								precedeComposite(elementTypeProvider.getXMemberFeatureCall_XAssignmentAssignableAction_1_0_0_0_0ElementType());
            	      								doneComposite();
            	      								associateWithSemanticElement();
            	      							
            	    }

            	    }

            	    // PsiInternalKobold.g:1662:7: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==46) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==47) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // PsiInternalKobold.g:1663:8: otherlv_2= '.'
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getXMemberFeatureCall_FullStopKeyword_1_0_0_0_1_0ElementType());
            	              							
            	            }
            	            otherlv_2=(Token)match(input,46,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(otherlv_2);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalKobold.g:1671:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // PsiInternalKobold.g:1671:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            // PsiInternalKobold.g:1672:9: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // PsiInternalKobold.g:1672:9: (lv_explicitStatic_3_0= '::' )
            	            // PsiInternalKobold.g:1673:10: lv_explicitStatic_3_0= '::'
            	            {
            	            if ( state.backtracking==0 ) {

            	              										markLeaf(elementTypeProvider.getXMemberFeatureCall_ExplicitStaticColonColonKeyword_1_0_0_0_1_1_0ElementType());
            	              									
            	            }
            	            lv_explicitStatic_3_0=(Token)match(input,47,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										doneLeaf(lv_explicitStatic_3_0);
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (!current) {
            	              											associateWithSemanticElement();
            	              											current = true;
            	              										}
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalKobold.g:1689:7: ( ( ruleFeatureCallID ) )
            	    // PsiInternalKobold.g:1690:8: ( ruleFeatureCallID )
            	    {
            	    // PsiInternalKobold.g:1690:8: ( ruleFeatureCallID )
            	    // PsiInternalKobold.g:1691:9: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (!current) {
            	      										associateWithSemanticElement();
            	      										current = true;
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									markComposite(elementTypeProvider.getXMemberFeatureCall_FeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0ElementType());
            	      								
            	    }
            	    pushFollow(FOLLOW_6);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									doneComposite();
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							markComposite(elementTypeProvider.getXMemberFeatureCall_OpSingleAssignParserRuleCall_1_0_0_0_3ElementType());
            	      						
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneComposite();
            	      						
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:1715:5: ( (lv_value_6_0= ruleXAssignment ) )
            	    // PsiInternalKobold.g:1716:6: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // PsiInternalKobold.g:1716:6: (lv_value_6_0= ruleXAssignment )
            	    // PsiInternalKobold.g:1717:7: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							markComposite(elementTypeProvider.getXMemberFeatureCall_ValueXAssignmentParserRuleCall_1_0_1_0ElementType());
            	      						
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_value_6_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneComposite();
            	      							if(!current) {
            	      								associateWithSemanticElement();
            	      								current = true;
            	      							}
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalKobold.g:1732:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // PsiInternalKobold.g:1732:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // PsiInternalKobold.g:1733:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // PsiInternalKobold.g:1733:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // PsiInternalKobold.g:1734:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // PsiInternalKobold.g:1754:6: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // PsiInternalKobold.g:1755:7: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // PsiInternalKobold.g:1755:7: ()
            	    // PsiInternalKobold.g:1756:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								precedeComposite(elementTypeProvider.getXMemberFeatureCall_XMemberFeatureCallMemberCallTargetAction_1_1_0_0_0ElementType());
            	      								doneComposite();
            	      								associateWithSemanticElement();
            	      							
            	    }

            	    }

            	    // PsiInternalKobold.g:1762:7: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // PsiInternalKobold.g:1763:8: otherlv_8= '.'
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getXMemberFeatureCall_FullStopKeyword_1_1_0_0_1_0ElementType());
            	              							
            	            }
            	            otherlv_8=(Token)match(input,46,FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(otherlv_8);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalKobold.g:1771:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // PsiInternalKobold.g:1771:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            // PsiInternalKobold.g:1772:9: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // PsiInternalKobold.g:1772:9: (lv_nullSafe_9_0= '?.' )
            	            // PsiInternalKobold.g:1773:10: lv_nullSafe_9_0= '?.'
            	            {
            	            if ( state.backtracking==0 ) {

            	              										markLeaf(elementTypeProvider.getXMemberFeatureCall_NullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0ElementType());
            	              									
            	            }
            	            lv_nullSafe_9_0=(Token)match(input,48,FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										doneLeaf(lv_nullSafe_9_0);
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (!current) {
            	              											associateWithSemanticElement();
            	              											current = true;
            	              										}
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // PsiInternalKobold.g:1789:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // PsiInternalKobold.g:1789:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            // PsiInternalKobold.g:1790:9: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // PsiInternalKobold.g:1790:9: (lv_explicitStatic_10_0= '::' )
            	            // PsiInternalKobold.g:1791:10: lv_explicitStatic_10_0= '::'
            	            {
            	            if ( state.backtracking==0 ) {

            	              										markLeaf(elementTypeProvider.getXMemberFeatureCall_ExplicitStaticColonColonKeyword_1_1_0_0_1_2_0ElementType());
            	              									
            	            }
            	            lv_explicitStatic_10_0=(Token)match(input,47,FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										doneLeaf(lv_explicitStatic_10_0);
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (!current) {
            	              											associateWithSemanticElement();
            	              											current = true;
            	              										}
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // PsiInternalKobold.g:1809:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==21) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // PsiInternalKobold.g:1810:6: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getXMemberFeatureCall_LessThanSignKeyword_1_1_1_0ElementType());
            	              					
            	            }
            	            otherlv_11=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_11);
            	              					
            	            }
            	            // PsiInternalKobold.g:1817:6: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // PsiInternalKobold.g:1818:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // PsiInternalKobold.g:1818:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // PsiInternalKobold.g:1819:8: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markComposite(elementTypeProvider.getXMemberFeatureCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0ElementType());
            	              							
            	            }
            	            pushFollow(FOLLOW_29);
            	            lv_typeArguments_12_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneComposite();
            	              								if(!current) {
            	              									associateWithSemanticElement();
            	              									current = true;
            	              								}
            	              							
            	            }

            	            }


            	            }

            	            // PsiInternalKobold.g:1832:6: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==49) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // PsiInternalKobold.g:1833:7: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      							markLeaf(elementTypeProvider.getXMemberFeatureCall_CommaKeyword_1_1_1_2_0ElementType());
            	            	      						
            	            	    }
            	            	    otherlv_13=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							doneLeaf(otherlv_13);
            	            	      						
            	            	    }
            	            	    // PsiInternalKobold.g:1840:7: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // PsiInternalKobold.g:1841:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // PsiInternalKobold.g:1841:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // PsiInternalKobold.g:1842:9: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									markComposite(elementTypeProvider.getXMemberFeatureCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0ElementType());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_typeArguments_14_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									doneComposite();
            	            	      									if(!current) {
            	            	      										associateWithSemanticElement();
            	            	      										current = true;
            	            	      									}
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop27;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getXMemberFeatureCall_GreaterThanSignKeyword_1_1_1_3ElementType());
            	              					
            	            }
            	            otherlv_15=(Token)match(input,22,FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_15);
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // PsiInternalKobold.g:1864:5: ( ( ruleIdOrSuper ) )
            	    // PsiInternalKobold.g:1865:6: ( ruleIdOrSuper )
            	    {
            	    // PsiInternalKobold.g:1865:6: ( ruleIdOrSuper )
            	    // PsiInternalKobold.g:1866:7: ruleIdOrSuper
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (!current) {
            	      								associateWithSemanticElement();
            	      								current = true;
            	      							}
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							markComposite(elementTypeProvider.getXMemberFeatureCall_FeatureJvmIdentifiableElementCrossReference_1_1_2_0ElementType());
            	      						
            	    }
            	    pushFollow(FOLLOW_30);
            	    ruleIdOrSuper();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneComposite();
            	      						
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:1881:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // PsiInternalKobold.g:1882:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // PsiInternalKobold.g:1882:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // PsiInternalKobold.g:1883:7: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // PsiInternalKobold.g:1887:7: (lv_explicitOperationCall_17_0= '(' )
            	            // PsiInternalKobold.g:1888:8: lv_explicitOperationCall_17_0= '('
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getXMemberFeatureCall_ExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0ElementType());
            	              							
            	            }
            	            lv_explicitOperationCall_17_0=(Token)match(input,50,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(lv_explicitOperationCall_17_0);
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (!current) {
            	              									associateWithSemanticElement();
            	              									current = true;
            	              								}
            	              							
            	            }

            	            }


            	            }

            	            // PsiInternalKobold.g:1903:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt30=3;
            	            alt30 = dfa30.predict(input);
            	            switch (alt30) {
            	                case 1 :
            	                    // PsiInternalKobold.g:1904:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // PsiInternalKobold.g:1904:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // PsiInternalKobold.g:1905:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // PsiInternalKobold.g:1930:8: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // PsiInternalKobold.g:1931:9: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									markComposite(elementTypeProvider.getXMemberFeatureCall_MemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0ElementType());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_32);
            	                    lv_memberCallArguments_18_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									doneComposite();
            	                      									if(!current) {
            	                      										associateWithSemanticElement();
            	                      										current = true;
            	                      									}
            	                      								
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // PsiInternalKobold.g:1945:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // PsiInternalKobold.g:1945:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // PsiInternalKobold.g:1946:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // PsiInternalKobold.g:1946:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // PsiInternalKobold.g:1947:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // PsiInternalKobold.g:1947:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // PsiInternalKobold.g:1948:10: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										markComposite(elementTypeProvider.getXMemberFeatureCall_MemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0ElementType());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_33);
            	                    lv_memberCallArguments_19_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										doneComposite();
            	                      										if(!current) {
            	                      											associateWithSemanticElement();
            	                      											current = true;
            	                      										}
            	                      									
            	                    }

            	                    }


            	                    }

            	                    // PsiInternalKobold.g:1961:8: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop29:
            	                    do {
            	                        int alt29=2;
            	                        int LA29_0 = input.LA(1);

            	                        if ( (LA29_0==49) ) {
            	                            alt29=1;
            	                        }


            	                        switch (alt29) {
            	                    	case 1 :
            	                    	    // PsiInternalKobold.g:1962:9: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									markLeaf(elementTypeProvider.getXMemberFeatureCall_CommaKeyword_1_1_3_1_1_1_0ElementType());
            	                    	      								
            	                    	    }
            	                    	    otherlv_20=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									doneLeaf(otherlv_20);
            	                    	      								
            	                    	    }
            	                    	    // PsiInternalKobold.g:1969:9: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // PsiInternalKobold.g:1970:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // PsiInternalKobold.g:1970:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // PsiInternalKobold.g:1971:11: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											markComposite(elementTypeProvider.getXMemberFeatureCall_MemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0ElementType());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_33);
            	                    	    lv_memberCallArguments_21_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											doneComposite();
            	                    	      											if(!current) {
            	                    	      												associateWithSemanticElement();
            	                    	      												current = true;
            	                    	      											}
            	                    	      										
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop29;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getXMemberFeatureCall_RightParenthesisKeyword_1_1_3_2ElementType());
            	              					
            	            }
            	            otherlv_22=(Token)match(input,51,FOLLOW_34); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_22);
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // PsiInternalKobold.g:1995:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // PsiInternalKobold.g:1996:6: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // PsiInternalKobold.g:2002:6: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // PsiInternalKobold.g:2003:7: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {

            	              							markComposite(elementTypeProvider.getXMemberFeatureCall_MemberCallArgumentsXClosureParserRuleCall_1_1_4_0ElementType());
            	              						
            	            }
            	            pushFollow(FOLLOW_25);
            	            lv_memberCallArguments_23_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							doneComposite();
            	              							if(!current) {
            	              								associateWithSemanticElement();
            	              								current = true;
            	              							}
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // PsiInternalKobold.g:2022:1: entryRuleXPrimaryExpression returns [Boolean current=false] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final Boolean entryRuleXPrimaryExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXPrimaryExpression = null;


        try {
            // PsiInternalKobold.g:2022:60: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // PsiInternalKobold.g:2023:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXPrimaryExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // PsiInternalKobold.g:2029:1: ruleXPrimaryExpression returns [Boolean current=false] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) ;
    public final Boolean ruleXPrimaryExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_XConstructorCall_0 = null;

        Boolean this_XBlockExpression_1 = null;

        Boolean this_XSwitchExpression_2 = null;

        Boolean this_XSynchronizedExpression_3 = null;

        Boolean this_XFeatureCall_4 = null;

        Boolean this_XLiteral_5 = null;

        Boolean this_XIfExpression_6 = null;

        Boolean this_XForLoopExpression_7 = null;

        Boolean this_XBasicForLoopExpression_8 = null;

        Boolean this_XWhileExpression_9 = null;

        Boolean this_XDoWhileExpression_10 = null;

        Boolean this_XThrowExpression_11 = null;

        Boolean this_XReturnExpression_12 = null;

        Boolean this_XTryCatchFinallyExpression_13 = null;

        Boolean this_XParenthesizedExpression_14 = null;


        try {
            // PsiInternalKobold.g:2030:1: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) )
            // PsiInternalKobold.g:2031:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            {
            // PsiInternalKobold.g:2031:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            int alt34=15;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // PsiInternalKobold.g:2032:3: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XConstructorCallParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XConstructorCall_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:2041:3: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XBlockExpressionParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBlockExpression_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:2050:3: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XSwitchExpressionParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSwitchExpression_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:2059:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    {
                    // PsiInternalKobold.g:2059:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    // PsiInternalKobold.g:2060:4: ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getXPrimaryExpression_XSynchronizedExpressionParserRuleCall_3ElementType());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XSynchronizedExpression_3=ruleXSynchronizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XSynchronizedExpression_3;
                      				doneComposite();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // PsiInternalKobold.g:2077:3: this_XFeatureCall_4= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XFeatureCallParserRuleCall_4ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFeatureCall_4=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFeatureCall_4;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalKobold.g:2086:3: this_XLiteral_5= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XLiteralParserRuleCall_5ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XLiteral_5=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XLiteral_5;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 7 :
                    // PsiInternalKobold.g:2095:3: this_XIfExpression_6= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XIfExpressionParserRuleCall_6ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XIfExpression_6=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XIfExpression_6;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 8 :
                    // PsiInternalKobold.g:2104:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    {
                    // PsiInternalKobold.g:2104:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    // PsiInternalKobold.g:2105:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getXPrimaryExpression_XForLoopExpressionParserRuleCall_7ElementType());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XForLoopExpression_7=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XForLoopExpression_7;
                      				doneComposite();
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // PsiInternalKobold.g:2128:3: this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XBasicForLoopExpressionParserRuleCall_8ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBasicForLoopExpression_8=ruleXBasicForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBasicForLoopExpression_8;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 10 :
                    // PsiInternalKobold.g:2137:3: this_XWhileExpression_9= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XWhileExpressionParserRuleCall_9ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XWhileExpression_9=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XWhileExpression_9;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 11 :
                    // PsiInternalKobold.g:2146:3: this_XDoWhileExpression_10= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XDoWhileExpressionParserRuleCall_10ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XDoWhileExpression_10=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XDoWhileExpression_10;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 12 :
                    // PsiInternalKobold.g:2155:3: this_XThrowExpression_11= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XThrowExpressionParserRuleCall_11ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XThrowExpression_11=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XThrowExpression_11;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 13 :
                    // PsiInternalKobold.g:2164:3: this_XReturnExpression_12= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XReturnExpressionParserRuleCall_12ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XReturnExpression_12=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XReturnExpression_12;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 14 :
                    // PsiInternalKobold.g:2173:3: this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XTryCatchFinallyExpressionParserRuleCall_13ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTryCatchFinallyExpression_13=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTryCatchFinallyExpression_13;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 15 :
                    // PsiInternalKobold.g:2182:3: this_XParenthesizedExpression_14= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXPrimaryExpression_XParenthesizedExpressionParserRuleCall_14ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XParenthesizedExpression_14=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XParenthesizedExpression_14;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // PsiInternalKobold.g:2194:1: entryRuleXLiteral returns [Boolean current=false] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final Boolean entryRuleXLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXLiteral = null;


        try {
            // PsiInternalKobold.g:2194:50: (iv_ruleXLiteral= ruleXLiteral EOF )
            // PsiInternalKobold.g:2195:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // PsiInternalKobold.g:2201:1: ruleXLiteral returns [Boolean current=false] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final Boolean ruleXLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean this_XCollectionLiteral_0 = null;

        Boolean this_XClosure_1 = null;

        Boolean this_XBooleanLiteral_2 = null;

        Boolean this_XNumberLiteral_3 = null;

        Boolean this_XNullLiteral_4 = null;

        Boolean this_XStringLiteral_5 = null;

        Boolean this_XTypeLiteral_6 = null;


        try {
            // PsiInternalKobold.g:2202:1: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // PsiInternalKobold.g:2203:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // PsiInternalKobold.g:2203:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt35=7;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            else if ( (LA35_0==55) && (synpred21_PsiInternalKobold())) {
                alt35=2;
            }
            else if ( ((LA35_0>=76 && LA35_0<=77)) ) {
                alt35=3;
            }
            else if ( ((LA35_0>=RULE_HEX && LA35_0<=RULE_DECIMAL)) ) {
                alt35=4;
            }
            else if ( (LA35_0==78) ) {
                alt35=5;
            }
            else if ( (LA35_0==RULE_STRING) ) {
                alt35=6;
            }
            else if ( (LA35_0==79) ) {
                alt35=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalKobold.g:2204:3: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XCollectionLiteralParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCollectionLiteral_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:2213:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // PsiInternalKobold.g:2213:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // PsiInternalKobold.g:2214:4: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getXLiteral_XClosureParserRuleCall_1ElementType());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XClosure_1;
                      				doneComposite();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:2230:3: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XBooleanLiteralParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBooleanLiteral_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:2239:3: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XNumberLiteralParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNumberLiteral_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalKobold.g:2248:3: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XNullLiteralParserRuleCall_4ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNullLiteral_4;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalKobold.g:2257:3: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XStringLiteralParserRuleCall_5ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XStringLiteral_5;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 7 :
                    // PsiInternalKobold.g:2266:3: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXLiteral_XTypeLiteralParserRuleCall_6ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTypeLiteral_6;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // PsiInternalKobold.g:2278:1: entryRuleXCollectionLiteral returns [Boolean current=false] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final Boolean entryRuleXCollectionLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXCollectionLiteral = null;


        try {
            // PsiInternalKobold.g:2278:60: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // PsiInternalKobold.g:2279:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXCollectionLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // PsiInternalKobold.g:2285:1: ruleXCollectionLiteral returns [Boolean current=false] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final Boolean ruleXCollectionLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean this_XSetLiteral_0 = null;

        Boolean this_XListLiteral_1 = null;


        try {
            // PsiInternalKobold.g:2286:1: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // PsiInternalKobold.g:2287:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // PsiInternalKobold.g:2287:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==53) ) {
                    alt36=1;
                }
                else if ( (LA36_1==55) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalKobold.g:2288:3: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXCollectionLiteral_XSetLiteralParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSetLiteral_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:2297:3: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXCollectionLiteral_XListLiteralParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XListLiteral_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // PsiInternalKobold.g:2309:1: entryRuleXSetLiteral returns [Boolean current=false] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final Boolean entryRuleXSetLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXSetLiteral = null;


        try {
            // PsiInternalKobold.g:2309:53: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // PsiInternalKobold.g:2310:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXSetLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // PsiInternalKobold.g:2316:1: ruleXSetLiteral returns [Boolean current=false] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final Boolean ruleXSetLiteral() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_elements_3_0 = null;

        Boolean lv_elements_5_0 = null;


        try {
            // PsiInternalKobold.g:2317:1: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // PsiInternalKobold.g:2318:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // PsiInternalKobold.g:2318:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // PsiInternalKobold.g:2319:3: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // PsiInternalKobold.g:2319:3: ()
            // PsiInternalKobold.g:2320:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXSetLiteral_XSetLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSetLiteral_NumberSignKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSetLiteral_LeftCurlyBracketKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,53,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:2340:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_DECIMAL)||LA38_0==14||LA38_0==21||(LA38_0>=37 && LA38_0<=38)||LA38_0==50||(LA38_0>=52 && LA38_0<=53)||LA38_0==55||LA38_0==59||LA38_0==61||(LA38_0>=65 && LA38_0<=67)||(LA38_0>=70 && LA38_0<=82)||LA38_0==84) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalKobold.g:2341:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // PsiInternalKobold.g:2341:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // PsiInternalKobold.g:2342:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:2342:5: (lv_elements_3_0= ruleXExpression )
                    // PsiInternalKobold.g:2343:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXSetLiteral_ElementsXExpressionParserRuleCall_3_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:2356:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==49) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // PsiInternalKobold.g:2357:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXSetLiteral_CommaKeyword_3_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_4=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_4);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:2364:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // PsiInternalKobold.g:2365:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // PsiInternalKobold.g:2365:6: (lv_elements_5_0= ruleXExpression )
                    	    // PsiInternalKobold.g:2366:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXSetLiteral_ElementsXExpressionParserRuleCall_3_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSetLiteral_RightCurlyBracketKeyword_4ElementType());
              		
            }
            otherlv_6=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // PsiInternalKobold.g:2392:1: entryRuleXListLiteral returns [Boolean current=false] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final Boolean entryRuleXListLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXListLiteral = null;


        try {
            // PsiInternalKobold.g:2392:54: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // PsiInternalKobold.g:2393:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXListLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // PsiInternalKobold.g:2399:1: ruleXListLiteral returns [Boolean current=false] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final Boolean ruleXListLiteral() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_elements_3_0 = null;

        Boolean lv_elements_5_0 = null;


        try {
            // PsiInternalKobold.g:2400:1: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // PsiInternalKobold.g:2401:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // PsiInternalKobold.g:2401:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // PsiInternalKobold.g:2402:3: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // PsiInternalKobold.g:2402:3: ()
            // PsiInternalKobold.g:2403:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXListLiteral_XListLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXListLiteral_NumberSignKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXListLiteral_LeftSquareBracketKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,55,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:2423:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_DECIMAL)||LA40_0==14||LA40_0==21||(LA40_0>=37 && LA40_0<=38)||LA40_0==50||(LA40_0>=52 && LA40_0<=53)||LA40_0==55||LA40_0==59||LA40_0==61||(LA40_0>=65 && LA40_0<=67)||(LA40_0>=70 && LA40_0<=82)||LA40_0==84) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalKobold.g:2424:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // PsiInternalKobold.g:2424:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // PsiInternalKobold.g:2425:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:2425:5: (lv_elements_3_0= ruleXExpression )
                    // PsiInternalKobold.g:2426:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXListLiteral_ElementsXExpressionParserRuleCall_3_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:2439:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==49) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // PsiInternalKobold.g:2440:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXListLiteral_CommaKeyword_3_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_4=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_4);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:2447:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // PsiInternalKobold.g:2448:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // PsiInternalKobold.g:2448:6: (lv_elements_5_0= ruleXExpression )
                    	    // PsiInternalKobold.g:2449:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXListLiteral_ElementsXExpressionParserRuleCall_3_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXListLiteral_RightSquareBracketKeyword_4ElementType());
              		
            }
            otherlv_6=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // PsiInternalKobold.g:2475:1: entryRuleXClosure returns [Boolean current=false] : iv_ruleXClosure= ruleXClosure EOF ;
    public final Boolean entryRuleXClosure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXClosure = null;


        try {
            // PsiInternalKobold.g:2475:50: (iv_ruleXClosure= ruleXClosure EOF )
            // PsiInternalKobold.g:2476:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXClosureElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // PsiInternalKobold.g:2482:1: ruleXClosure returns [Boolean current=false] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final Boolean ruleXClosure() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        Boolean lv_declaredFormalParameters_2_0 = null;

        Boolean lv_declaredFormalParameters_4_0 = null;

        Boolean lv_expression_6_0 = null;


        try {
            // PsiInternalKobold.g:2483:1: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // PsiInternalKobold.g:2484:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // PsiInternalKobold.g:2484:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // PsiInternalKobold.g:2485:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // PsiInternalKobold.g:2485:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // PsiInternalKobold.g:2486:4: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // PsiInternalKobold.g:2492:4: ( () otherlv_1= '[' )
            // PsiInternalKobold.g:2493:5: () otherlv_1= '['
            {
            // PsiInternalKobold.g:2493:5: ()
            // PsiInternalKobold.g:2494:6: 
            {
            if ( state.backtracking==0 ) {

              						precedeComposite(elementTypeProvider.getXClosure_XClosureAction_0_0_0ElementType());
              						doneComposite();
              						associateWithSemanticElement();
              					
            }

            }

            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXClosure_LeftSquareBracketKeyword_0_0_1ElementType());
              				
            }
            otherlv_1=(Token)match(input,55,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_1);
              				
            }

            }


            }

            // PsiInternalKobold.g:2509:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // PsiInternalKobold.g:2510:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // PsiInternalKobold.g:2533:4: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // PsiInternalKobold.g:2534:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // PsiInternalKobold.g:2534:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID||LA42_0==34||LA42_0==50) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // PsiInternalKobold.g:2535:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // PsiInternalKobold.g:2535:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // PsiInternalKobold.g:2536:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // PsiInternalKobold.g:2536:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // PsiInternalKobold.g:2537:8: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getXClosure_DeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_42);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalKobold.g:2550:6: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==49) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // PsiInternalKobold.g:2551:7: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getXClosure_CommaKeyword_1_0_0_1_0ElementType());
                            	      						
                            	    }
                            	    otherlv_3=(Token)match(input,49,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(otherlv_3);
                            	      						
                            	    }
                            	    // PsiInternalKobold.g:2558:7: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // PsiInternalKobold.g:2559:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // PsiInternalKobold.g:2559:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // PsiInternalKobold.g:2560:9: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									markComposite(elementTypeProvider.getXClosure_DeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0ElementType());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									doneComposite();
                            	      									if(!current) {
                            	      										associateWithSemanticElement();
                            	      										current = true;
                            	      									}
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // PsiInternalKobold.g:2575:5: ( (lv_explicitSyntax_5_0= '|' ) )
                    // PsiInternalKobold.g:2576:6: (lv_explicitSyntax_5_0= '|' )
                    {
                    // PsiInternalKobold.g:2576:6: (lv_explicitSyntax_5_0= '|' )
                    // PsiInternalKobold.g:2577:7: lv_explicitSyntax_5_0= '|'
                    {
                    if ( state.backtracking==0 ) {

                      							markLeaf(elementTypeProvider.getXClosure_ExplicitSyntaxVerticalLineKeyword_1_0_1_0ElementType());
                      						
                    }
                    lv_explicitSyntax_5_0=(Token)match(input,57,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneLeaf(lv_explicitSyntax_5_0);
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:2594:3: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // PsiInternalKobold.g:2595:4: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // PsiInternalKobold.g:2595:4: (lv_expression_6_0= ruleXExpressionInClosure )
            // PsiInternalKobold.g:2596:5: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXClosure_ExpressionXExpressionInClosureParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_44);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXClosure_RightSquareBracketKeyword_3ElementType());
              		
            }
            otherlv_7=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_7);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // PsiInternalKobold.g:2620:1: entryRuleXExpressionInClosure returns [Boolean current=false] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final Boolean entryRuleXExpressionInClosure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXExpressionInClosure = null;


        try {
            // PsiInternalKobold.g:2620:62: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // PsiInternalKobold.g:2621:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXExpressionInClosureElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // PsiInternalKobold.g:2627:1: ruleXExpressionInClosure returns [Boolean current=false] : ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) ;
    public final Boolean ruleXExpressionInClosure() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean lv_expressions_1_0 = null;


        try {
            // PsiInternalKobold.g:2628:1: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) )
            // PsiInternalKobold.g:2629:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            {
            // PsiInternalKobold.g:2629:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            // PsiInternalKobold.g:2630:3: () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            {
            // PsiInternalKobold.g:2630:3: ()
            // PsiInternalKobold.g:2631:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXExpressionInClosure_XBlockExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:2637:3: ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_DECIMAL)||LA45_0==14||LA45_0==21||(LA45_0>=37 && LA45_0<=38)||LA45_0==50||(LA45_0>=52 && LA45_0<=53)||LA45_0==55||LA45_0==59||LA45_0==61||(LA45_0>=65 && LA45_0<=82)||LA45_0==84) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // PsiInternalKobold.g:2638:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )?
            	    {
            	    // PsiInternalKobold.g:2638:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) )
            	    // PsiInternalKobold.g:2639:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // PsiInternalKobold.g:2639:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    // PsiInternalKobold.g:2640:6: lv_expressions_1_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXExpressionInClosure_ExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_expressions_1_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:2653:4: (otherlv_2= ';' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==58) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // PsiInternalKobold.g:2654:5: otherlv_2= ';'
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getXExpressionInClosure_SemicolonKeyword_1_1ElementType());
            	              				
            	            }
            	            otherlv_2=(Token)match(input,58,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(otherlv_2);
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // PsiInternalKobold.g:2667:1: entryRuleXShortClosure returns [Boolean current=false] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final Boolean entryRuleXShortClosure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXShortClosure = null;


        try {
            // PsiInternalKobold.g:2667:55: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // PsiInternalKobold.g:2668:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXShortClosureElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // PsiInternalKobold.g:2674:1: ruleXShortClosure returns [Boolean current=false] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXShortClosure() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        Boolean lv_declaredFormalParameters_1_0 = null;

        Boolean lv_declaredFormalParameters_3_0 = null;

        Boolean lv_expression_5_0 = null;


        try {
            // PsiInternalKobold.g:2675:1: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:2676:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:2676:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:2677:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:2677:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // PsiInternalKobold.g:2678:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // PsiInternalKobold.g:2703:4: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // PsiInternalKobold.g:2704:5: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // PsiInternalKobold.g:2704:5: ()
            // PsiInternalKobold.g:2705:6: 
            {
            if ( state.backtracking==0 ) {

              						precedeComposite(elementTypeProvider.getXShortClosure_XClosureAction_0_0_0ElementType());
              						doneComposite();
              						associateWithSemanticElement();
              					
            }

            }

            // PsiInternalKobold.g:2711:5: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==34||LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalKobold.g:2712:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // PsiInternalKobold.g:2712:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // PsiInternalKobold.g:2713:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // PsiInternalKobold.g:2713:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // PsiInternalKobold.g:2714:8: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      								markComposite(elementTypeProvider.getXShortClosure_DeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0ElementType());
                      							
                    }
                    pushFollow(FOLLOW_42);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								doneComposite();
                      								if(!current) {
                      									associateWithSemanticElement();
                      									current = true;
                      								}
                      							
                    }

                    }


                    }

                    // PsiInternalKobold.g:2727:6: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==49) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // PsiInternalKobold.g:2728:7: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markLeaf(elementTypeProvider.getXShortClosure_CommaKeyword_0_0_1_1_0ElementType());
                    	      						
                    	    }
                    	    otherlv_2=(Token)match(input,49,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneLeaf(otherlv_2);
                    	      						
                    	    }
                    	    // PsiInternalKobold.g:2735:7: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // PsiInternalKobold.g:2736:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // PsiInternalKobold.g:2736:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // PsiInternalKobold.g:2737:9: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									markComposite(elementTypeProvider.getXShortClosure_DeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0ElementType());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      									doneComposite();
                    	      									if(!current) {
                    	      										associateWithSemanticElement();
                    	      										current = true;
                    	      									}
                    	      								
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalKobold.g:2752:5: ( (lv_explicitSyntax_4_0= '|' ) )
            // PsiInternalKobold.g:2753:6: (lv_explicitSyntax_4_0= '|' )
            {
            // PsiInternalKobold.g:2753:6: (lv_explicitSyntax_4_0= '|' )
            // PsiInternalKobold.g:2754:7: lv_explicitSyntax_4_0= '|'
            {
            if ( state.backtracking==0 ) {

              							markLeaf(elementTypeProvider.getXShortClosure_ExplicitSyntaxVerticalLineKeyword_0_0_2_0ElementType());
              						
            }
            lv_explicitSyntax_4_0=(Token)match(input,57,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							doneLeaf(lv_explicitSyntax_4_0);
              						
            }
            if ( state.backtracking==0 ) {

              							if (!current) {
              								associateWithSemanticElement();
              								current = true;
              							}
              						
            }

            }


            }


            }


            }

            // PsiInternalKobold.g:2771:3: ( (lv_expression_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:2772:4: (lv_expression_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:2772:4: (lv_expression_5_0= ruleXExpression )
            // PsiInternalKobold.g:2773:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXShortClosure_ExpressionXExpressionParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // PsiInternalKobold.g:2790:1: entryRuleXParenthesizedExpression returns [Boolean current=false] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final Boolean entryRuleXParenthesizedExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXParenthesizedExpression = null;


        try {
            // PsiInternalKobold.g:2790:66: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // PsiInternalKobold.g:2791:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXParenthesizedExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // PsiInternalKobold.g:2797:1: ruleXParenthesizedExpression returns [Boolean current=false] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final Boolean ruleXParenthesizedExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean this_XExpression_1 = null;


        try {
            // PsiInternalKobold.g:2798:1: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // PsiInternalKobold.g:2799:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // PsiInternalKobold.g:2799:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // PsiInternalKobold.g:2800:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXParenthesizedExpression_LeftParenthesisKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getXParenthesizedExpression_XExpressionParserRuleCall_1ElementType());
              		
            }
            pushFollow(FOLLOW_32);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XExpression_1;
              			doneComposite();
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXParenthesizedExpression_RightParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // PsiInternalKobold.g:2826:1: entryRuleXIfExpression returns [Boolean current=false] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final Boolean entryRuleXIfExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXIfExpression = null;


        try {
            // PsiInternalKobold.g:2826:55: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // PsiInternalKobold.g:2827:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXIfExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // PsiInternalKobold.g:2833:1: ruleXIfExpression returns [Boolean current=false] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final Boolean ruleXIfExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_if_3_0 = null;

        Boolean lv_then_5_0 = null;

        Boolean lv_else_7_0 = null;


        try {
            // PsiInternalKobold.g:2834:1: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // PsiInternalKobold.g:2835:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // PsiInternalKobold.g:2835:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // PsiInternalKobold.g:2836:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // PsiInternalKobold.g:2836:3: ()
            // PsiInternalKobold.g:2837:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXIfExpression_XIfExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXIfExpression_IfKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,59,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXIfExpression_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:2857:3: ( (lv_if_3_0= ruleXExpression ) )
            // PsiInternalKobold.g:2858:4: (lv_if_3_0= ruleXExpression )
            {
            // PsiInternalKobold.g:2858:4: (lv_if_3_0= ruleXExpression )
            // PsiInternalKobold.g:2859:5: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXIfExpression_IfXExpressionParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXIfExpression_RightParenthesisKeyword_4ElementType());
              		
            }
            otherlv_4=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalKobold.g:2879:3: ( (lv_then_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:2880:4: (lv_then_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:2880:4: (lv_then_5_0= ruleXExpression )
            // PsiInternalKobold.g:2881:5: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXIfExpression_ThenXExpressionParserRuleCall_5_0ElementType());
              				
            }
            pushFollow(FOLLOW_48);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalKobold.g:2894:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==60) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred25_PsiInternalKobold()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalKobold.g:2895:4: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // PsiInternalKobold.g:2895:4: ( ( 'else' )=>otherlv_6= 'else' )
                    // PsiInternalKobold.g:2896:5: ( 'else' )=>otherlv_6= 'else'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getXIfExpression_ElseKeyword_6_0ElementType());
                      				
                    }
                    otherlv_6=(Token)match(input,60,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_6);
                      				
                    }

                    }

                    // PsiInternalKobold.g:2905:4: ( (lv_else_7_0= ruleXExpression ) )
                    // PsiInternalKobold.g:2906:5: (lv_else_7_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:2906:5: (lv_else_7_0= ruleXExpression )
                    // PsiInternalKobold.g:2907:6: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXIfExpression_ElseXExpressionParserRuleCall_6_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // PsiInternalKobold.g:2925:1: entryRuleXSwitchExpression returns [Boolean current=false] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final Boolean entryRuleXSwitchExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXSwitchExpression = null;


        try {
            // PsiInternalKobold.g:2925:59: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // PsiInternalKobold.g:2926:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXSwitchExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // PsiInternalKobold.g:2932:1: ruleXSwitchExpression returns [Boolean current=false] : ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final Boolean ruleXSwitchExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Boolean lv_declaredParam_3_0 = null;

        Boolean lv_switch_5_0 = null;

        Boolean lv_declaredParam_7_0 = null;

        Boolean lv_switch_9_0 = null;

        Boolean lv_cases_11_0 = null;

        Boolean lv_default_14_0 = null;


        try {
            // PsiInternalKobold.g:2933:1: ( ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // PsiInternalKobold.g:2934:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // PsiInternalKobold.g:2934:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // PsiInternalKobold.g:2935:3: () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // PsiInternalKobold.g:2935:3: ()
            // PsiInternalKobold.g:2936:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXSwitchExpression_XSwitchExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSwitchExpression_SwitchKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,61,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:2949:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // PsiInternalKobold.g:2950:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    {
                    // PsiInternalKobold.g:2950:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    // PsiInternalKobold.g:2951:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')'
                    {
                    // PsiInternalKobold.g:2951:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
                    // PsiInternalKobold.g:2952:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    {
                    // PsiInternalKobold.g:2962:6: (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    // PsiInternalKobold.g:2963:7: otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
                    {
                    if ( state.backtracking==0 ) {

                      							markLeaf(elementTypeProvider.getXSwitchExpression_LeftParenthesisKeyword_2_0_0_0_0ElementType());
                      						
                    }
                    otherlv_2=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneLeaf(otherlv_2);
                      						
                    }
                    // PsiInternalKobold.g:2970:7: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
                    // PsiInternalKobold.g:2971:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    {
                    // PsiInternalKobold.g:2971:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    // PsiInternalKobold.g:2972:9: lv_declaredParam_3_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      									markComposite(elementTypeProvider.getXSwitchExpression_DeclaredParamJvmFormalParameterParserRuleCall_2_0_0_0_1_0ElementType());
                      								
                    }
                    pushFollow(FOLLOW_50);
                    lv_declaredParam_3_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      									doneComposite();
                      									if(!current) {
                      										associateWithSemanticElement();
                      										current = true;
                      									}
                      								
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      							markLeaf(elementTypeProvider.getXSwitchExpression_ColonKeyword_2_0_0_0_2ElementType());
                      						
                    }
                    otherlv_4=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneLeaf(otherlv_4);
                      						
                    }

                    }


                    }

                    // PsiInternalKobold.g:2994:5: ( (lv_switch_5_0= ruleXExpression ) )
                    // PsiInternalKobold.g:2995:6: (lv_switch_5_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:2995:6: (lv_switch_5_0= ruleXExpression )
                    // PsiInternalKobold.g:2996:7: lv_switch_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXSwitchExpression_SwitchXExpressionParserRuleCall_2_0_1_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    lv_switch_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getXSwitchExpression_RightParenthesisKeyword_2_0_2ElementType());
                      				
                    }
                    otherlv_6=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_6);
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:3018:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    {
                    // PsiInternalKobold.g:3018:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    // PsiInternalKobold.g:3019:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) )
                    {
                    // PsiInternalKobold.g:3019:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?
                    int alt49=2;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // PsiInternalKobold.g:3020:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            {
                            // PsiInternalKobold.g:3029:6: ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            // PsiInternalKobold.g:3030:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':'
                            {
                            // PsiInternalKobold.g:3030:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) )
                            // PsiInternalKobold.g:3031:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            {
                            // PsiInternalKobold.g:3031:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            // PsiInternalKobold.g:3032:9: lv_declaredParam_7_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              									markComposite(elementTypeProvider.getXSwitchExpression_DeclaredParamJvmFormalParameterParserRuleCall_2_1_0_0_0_0ElementType());
                              								
                            }
                            pushFollow(FOLLOW_50);
                            lv_declaredParam_7_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									doneComposite();
                              									if(!current) {
                              										associateWithSemanticElement();
                              										current = true;
                              									}
                              								
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getXSwitchExpression_ColonKeyword_2_1_0_0_1ElementType());
                              						
                            }
                            otherlv_8=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(otherlv_8);
                              						
                            }

                            }


                            }
                            break;

                    }

                    // PsiInternalKobold.g:3054:5: ( (lv_switch_9_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3055:6: (lv_switch_9_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3055:6: (lv_switch_9_0= ruleXExpression )
                    // PsiInternalKobold.g:3056:7: lv_switch_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXSwitchExpression_SwitchXExpressionParserRuleCall_2_1_1_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_35);
                    lv_switch_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSwitchExpression_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_10=(Token)match(input,53,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_10);
              		
            }
            // PsiInternalKobold.g:3078:3: ( (lv_cases_11_0= ruleXCasePart ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==34||(LA51_0>=49 && LA51_0<=50)||LA51_0==62||LA51_0==64) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // PsiInternalKobold.g:3079:4: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // PsiInternalKobold.g:3079:4: (lv_cases_11_0= ruleXCasePart )
            	    // PsiInternalKobold.g:3080:5: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getXSwitchExpression_CasesXCasePartParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // PsiInternalKobold.g:3093:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==63) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalKobold.g:3094:4: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXSwitchExpression_DefaultKeyword_5_0ElementType());
                      			
                    }
                    otherlv_12=(Token)match(input,63,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXSwitchExpression_ColonKeyword_5_1ElementType());
                      			
                    }
                    otherlv_13=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_13);
                      			
                    }
                    // PsiInternalKobold.g:3108:4: ( (lv_default_14_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3109:5: (lv_default_14_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3109:5: (lv_default_14_0= ruleXExpression )
                    // PsiInternalKobold.g:3110:6: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXSwitchExpression_DefaultXExpressionParserRuleCall_5_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSwitchExpression_RightCurlyBracketKeyword_6ElementType());
              		
            }
            otherlv_15=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_15);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // PsiInternalKobold.g:3135:1: entryRuleXCasePart returns [Boolean current=false] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final Boolean entryRuleXCasePart() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXCasePart = null;


        try {
            // PsiInternalKobold.g:3135:51: (iv_ruleXCasePart= ruleXCasePart EOF )
            // PsiInternalKobold.g:3136:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXCasePartElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // PsiInternalKobold.g:3142:1: ruleXCasePart returns [Boolean current=false] : ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) ;
    public final Boolean ruleXCasePart() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fallThrough_6_0=null;
        Boolean lv_typeGuard_1_0 = null;

        Boolean lv_case_3_0 = null;

        Boolean lv_then_5_0 = null;


        try {
            // PsiInternalKobold.g:3143:1: ( ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) )
            // PsiInternalKobold.g:3144:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            {
            // PsiInternalKobold.g:3144:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            // PsiInternalKobold.g:3145:3: () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            {
            // PsiInternalKobold.g:3145:3: ()
            // PsiInternalKobold.g:3146:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXCasePart_XCasePartAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:3152:3: ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==34||LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalKobold.g:3153:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    {
                    // PsiInternalKobold.g:3153:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    // PsiInternalKobold.g:3154:5: lv_typeGuard_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getXCasePart_TypeGuardJvmTypeReferenceParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_53);
                    lv_typeGuard_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:3167:3: (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // PsiInternalKobold.g:3168:4: otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXCasePart_CaseKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,64,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalKobold.g:3175:4: ( (lv_case_3_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3176:5: (lv_case_3_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3176:5: (lv_case_3_0= ruleXExpression )
                    // PsiInternalKobold.g:3177:6: lv_case_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXCasePart_CaseXExpressionParserRuleCall_2_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_case_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:3191:3: ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            else if ( (LA55_0==49) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // PsiInternalKobold.g:3192:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    {
                    // PsiInternalKobold.g:3192:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    // PsiInternalKobold.g:3193:5: otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getXCasePart_ColonKeyword_3_0_0ElementType());
                      				
                    }
                    otherlv_4=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_4);
                      				
                    }
                    // PsiInternalKobold.g:3200:5: ( (lv_then_5_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3201:6: (lv_then_5_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3201:6: (lv_then_5_0= ruleXExpression )
                    // PsiInternalKobold.g:3202:7: lv_then_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXCasePart_ThenXExpressionParserRuleCall_3_0_1_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_then_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:3217:4: ( (lv_fallThrough_6_0= ',' ) )
                    {
                    // PsiInternalKobold.g:3217:4: ( (lv_fallThrough_6_0= ',' ) )
                    // PsiInternalKobold.g:3218:5: (lv_fallThrough_6_0= ',' )
                    {
                    // PsiInternalKobold.g:3218:5: (lv_fallThrough_6_0= ',' )
                    // PsiInternalKobold.g:3219:6: lv_fallThrough_6_0= ','
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getXCasePart_FallThroughCommaKeyword_3_1_0ElementType());
                      					
                    }
                    lv_fallThrough_6_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_fallThrough_6_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // PsiInternalKobold.g:3239:1: entryRuleXForLoopExpression returns [Boolean current=false] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final Boolean entryRuleXForLoopExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXForLoopExpression = null;


        try {
            // PsiInternalKobold.g:3239:60: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // PsiInternalKobold.g:3240:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXForLoopExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // PsiInternalKobold.g:3246:1: ruleXForLoopExpression returns [Boolean current=false] : ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXForLoopExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_declaredParam_3_0 = null;

        Boolean lv_forExpression_5_0 = null;

        Boolean lv_eachExpression_7_0 = null;


        try {
            // PsiInternalKobold.g:3247:1: ( ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:3248:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:3248:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:3249:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:3249:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
            // PsiInternalKobold.g:3250:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            {
            // PsiInternalKobold.g:3263:4: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            // PsiInternalKobold.g:3264:5: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
            {
            // PsiInternalKobold.g:3264:5: ()
            // PsiInternalKobold.g:3265:6: 
            {
            if ( state.backtracking==0 ) {

              						precedeComposite(elementTypeProvider.getXForLoopExpression_XForLoopExpressionAction_0_0_0ElementType());
              						doneComposite();
              						associateWithSemanticElement();
              					
            }

            }

            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXForLoopExpression_ForKeyword_0_0_1ElementType());
              				
            }
            otherlv_1=(Token)match(input,65,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_1);
              				
            }
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXForLoopExpression_LeftParenthesisKeyword_0_0_2ElementType());
              				
            }
            otherlv_2=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_2);
              				
            }
            // PsiInternalKobold.g:3285:5: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // PsiInternalKobold.g:3286:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // PsiInternalKobold.g:3286:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // PsiInternalKobold.g:3287:7: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              							markComposite(elementTypeProvider.getXForLoopExpression_DeclaredParamJvmFormalParameterParserRuleCall_0_0_3_0ElementType());
              						
            }
            pushFollow(FOLLOW_50);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							doneComposite();
              							if(!current) {
              								associateWithSemanticElement();
              								current = true;
              							}
              						
            }

            }


            }

            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXForLoopExpression_ColonKeyword_0_0_4ElementType());
              				
            }
            otherlv_4=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_4);
              				
            }

            }


            }

            // PsiInternalKobold.g:3309:3: ( (lv_forExpression_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:3310:4: (lv_forExpression_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3310:4: (lv_forExpression_5_0= ruleXExpression )
            // PsiInternalKobold.g:3311:5: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXForLoopExpression_ForExpressionXExpressionParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXForLoopExpression_RightParenthesisKeyword_2ElementType());
              		
            }
            otherlv_6=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }
            // PsiInternalKobold.g:3331:3: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // PsiInternalKobold.g:3332:4: (lv_eachExpression_7_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3332:4: (lv_eachExpression_7_0= ruleXExpression )
            // PsiInternalKobold.g:3333:5: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXForLoopExpression_EachExpressionXExpressionParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXBasicForLoopExpression"
    // PsiInternalKobold.g:3350:1: entryRuleXBasicForLoopExpression returns [Boolean current=false] : iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF ;
    public final Boolean entryRuleXBasicForLoopExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXBasicForLoopExpression = null;


        try {
            // PsiInternalKobold.g:3350:65: (iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF )
            // PsiInternalKobold.g:3351:2: iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXBasicForLoopExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBasicForLoopExpression=ruleXBasicForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBasicForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBasicForLoopExpression"


    // $ANTLR start "ruleXBasicForLoopExpression"
    // PsiInternalKobold.g:3357:1: ruleXBasicForLoopExpression returns [Boolean current=false] : ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXBasicForLoopExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Boolean lv_initExpressions_3_0 = null;

        Boolean lv_initExpressions_5_0 = null;

        Boolean lv_expression_7_0 = null;

        Boolean lv_updateExpressions_9_0 = null;

        Boolean lv_updateExpressions_11_0 = null;

        Boolean lv_eachExpression_13_0 = null;


        try {
            // PsiInternalKobold.g:3358:1: ( ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:3359:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:3359:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:3360:3: () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:3360:3: ()
            // PsiInternalKobold.g:3361:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXBasicForLoopExpression_XBasicForLoopExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBasicForLoopExpression_ForKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,65,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBasicForLoopExpression_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,50,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:3381:3: ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_DECIMAL)||LA57_0==14||LA57_0==21||(LA57_0>=37 && LA57_0<=38)||LA57_0==50||(LA57_0>=52 && LA57_0<=53)||LA57_0==55||LA57_0==59||LA57_0==61||(LA57_0>=65 && LA57_0<=82)||LA57_0==84) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // PsiInternalKobold.g:3382:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    {
                    // PsiInternalKobold.g:3382:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) )
                    // PsiInternalKobold.g:3383:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    {
                    // PsiInternalKobold.g:3383:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    // PsiInternalKobold.g:3384:6: lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXBasicForLoopExpression_InitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_56);
                    lv_initExpressions_3_0=ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:3397:4: (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==49) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // PsiInternalKobold.g:3398:5: otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXBasicForLoopExpression_CommaKeyword_3_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_4=(Token)match(input,49,FOLLOW_57); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_4);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:3405:5: ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    // PsiInternalKobold.g:3406:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    {
                    	    // PsiInternalKobold.g:3406:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    // PsiInternalKobold.g:3407:7: lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXBasicForLoopExpression_InitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_initExpressions_5_0=ruleXExpressionOrVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBasicForLoopExpression_SemicolonKeyword_4ElementType());
              		
            }
            otherlv_6=(Token)match(input,58,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }
            // PsiInternalKobold.g:3429:3: ( (lv_expression_7_0= ruleXExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_DECIMAL)||LA58_0==14||LA58_0==21||(LA58_0>=37 && LA58_0<=38)||LA58_0==50||(LA58_0>=52 && LA58_0<=53)||LA58_0==55||LA58_0==59||LA58_0==61||(LA58_0>=65 && LA58_0<=67)||(LA58_0>=70 && LA58_0<=82)||LA58_0==84) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // PsiInternalKobold.g:3430:4: (lv_expression_7_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3430:4: (lv_expression_7_0= ruleXExpression )
                    // PsiInternalKobold.g:3431:5: lv_expression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getXBasicForLoopExpression_ExpressionXExpressionParserRuleCall_5_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_59);
                    lv_expression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBasicForLoopExpression_SemicolonKeyword_6ElementType());
              		
            }
            otherlv_8=(Token)match(input,58,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_8);
              		
            }
            // PsiInternalKobold.g:3451:3: ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_DECIMAL)||LA60_0==14||LA60_0==21||(LA60_0>=37 && LA60_0<=38)||LA60_0==50||(LA60_0>=52 && LA60_0<=53)||LA60_0==55||LA60_0==59||LA60_0==61||(LA60_0>=65 && LA60_0<=67)||(LA60_0>=70 && LA60_0<=82)||LA60_0==84) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // PsiInternalKobold.g:3452:4: ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    {
                    // PsiInternalKobold.g:3452:4: ( (lv_updateExpressions_9_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3453:5: (lv_updateExpressions_9_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3453:5: (lv_updateExpressions_9_0= ruleXExpression )
                    // PsiInternalKobold.g:3454:6: lv_updateExpressions_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXBasicForLoopExpression_UpdateExpressionsXExpressionParserRuleCall_7_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_updateExpressions_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:3467:4: (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==49) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // PsiInternalKobold.g:3468:5: otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXBasicForLoopExpression_CommaKeyword_7_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_10=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_10);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:3475:5: ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    // PsiInternalKobold.g:3476:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    {
                    	    // PsiInternalKobold.g:3476:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    // PsiInternalKobold.g:3477:7: lv_updateExpressions_11_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXBasicForLoopExpression_UpdateExpressionsXExpressionParserRuleCall_7_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_updateExpressions_11_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBasicForLoopExpression_RightParenthesisKeyword_8ElementType());
              		
            }
            otherlv_12=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_12);
              		
            }
            // PsiInternalKobold.g:3499:3: ( (lv_eachExpression_13_0= ruleXExpression ) )
            // PsiInternalKobold.g:3500:4: (lv_eachExpression_13_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3500:4: (lv_eachExpression_13_0= ruleXExpression )
            // PsiInternalKobold.g:3501:5: lv_eachExpression_13_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXBasicForLoopExpression_EachExpressionXExpressionParserRuleCall_9_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_13_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBasicForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // PsiInternalKobold.g:3518:1: entryRuleXWhileExpression returns [Boolean current=false] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final Boolean entryRuleXWhileExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXWhileExpression = null;


        try {
            // PsiInternalKobold.g:3518:58: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // PsiInternalKobold.g:3519:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXWhileExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // PsiInternalKobold.g:3525:1: ruleXWhileExpression returns [Boolean current=false] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXWhileExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_predicate_3_0 = null;

        Boolean lv_body_5_0 = null;


        try {
            // PsiInternalKobold.g:3526:1: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:3527:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:3527:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:3528:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:3528:3: ()
            // PsiInternalKobold.g:3529:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXWhileExpression_XWhileExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXWhileExpression_WhileKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,66,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXWhileExpression_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:3549:3: ( (lv_predicate_3_0= ruleXExpression ) )
            // PsiInternalKobold.g:3550:4: (lv_predicate_3_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3550:4: (lv_predicate_3_0= ruleXExpression )
            // PsiInternalKobold.g:3551:5: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXWhileExpression_PredicateXExpressionParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXWhileExpression_RightParenthesisKeyword_4ElementType());
              		
            }
            otherlv_4=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalKobold.g:3571:3: ( (lv_body_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:3572:4: (lv_body_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3572:4: (lv_body_5_0= ruleXExpression )
            // PsiInternalKobold.g:3573:5: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXWhileExpression_BodyXExpressionParserRuleCall_5_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // PsiInternalKobold.g:3590:1: entryRuleXDoWhileExpression returns [Boolean current=false] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final Boolean entryRuleXDoWhileExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXDoWhileExpression = null;


        try {
            // PsiInternalKobold.g:3590:60: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // PsiInternalKobold.g:3591:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXDoWhileExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // PsiInternalKobold.g:3597:1: ruleXDoWhileExpression returns [Boolean current=false] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final Boolean ruleXDoWhileExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_body_2_0 = null;

        Boolean lv_predicate_5_0 = null;


        try {
            // PsiInternalKobold.g:3598:1: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // PsiInternalKobold.g:3599:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // PsiInternalKobold.g:3599:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // PsiInternalKobold.g:3600:3: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // PsiInternalKobold.g:3600:3: ()
            // PsiInternalKobold.g:3601:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXDoWhileExpression_XDoWhileExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXDoWhileExpression_DoKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,67,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:3614:3: ( (lv_body_2_0= ruleXExpression ) )
            // PsiInternalKobold.g:3615:4: (lv_body_2_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3615:4: (lv_body_2_0= ruleXExpression )
            // PsiInternalKobold.g:3616:5: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXDoWhileExpression_BodyXExpressionParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_61);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXDoWhileExpression_WhileKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,66,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXDoWhileExpression_LeftParenthesisKeyword_4ElementType());
              		
            }
            otherlv_4=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalKobold.g:3643:3: ( (lv_predicate_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:3644:4: (lv_predicate_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:3644:4: (lv_predicate_5_0= ruleXExpression )
            // PsiInternalKobold.g:3645:5: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXDoWhileExpression_PredicateXExpressionParserRuleCall_5_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXDoWhileExpression_RightParenthesisKeyword_6ElementType());
              		
            }
            otherlv_6=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // PsiInternalKobold.g:3669:1: entryRuleXBlockExpression returns [Boolean current=false] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final Boolean entryRuleXBlockExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXBlockExpression = null;


        try {
            // PsiInternalKobold.g:3669:58: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // PsiInternalKobold.g:3670:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXBlockExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // PsiInternalKobold.g:3676:1: ruleXBlockExpression returns [Boolean current=false] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final Boolean ruleXBlockExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_expressions_2_0 = null;


        try {
            // PsiInternalKobold.g:3677:1: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // PsiInternalKobold.g:3678:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // PsiInternalKobold.g:3678:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // PsiInternalKobold.g:3679:3: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // PsiInternalKobold.g:3679:3: ()
            // PsiInternalKobold.g:3680:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXBlockExpression_XBlockExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBlockExpression_LeftCurlyBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,53,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:3693:3: ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_DECIMAL)||LA62_0==14||LA62_0==21||(LA62_0>=37 && LA62_0<=38)||LA62_0==50||(LA62_0>=52 && LA62_0<=53)||LA62_0==55||LA62_0==59||LA62_0==61||(LA62_0>=65 && LA62_0<=82)||LA62_0==84) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // PsiInternalKobold.g:3694:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )?
            	    {
            	    // PsiInternalKobold.g:3694:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) )
            	    // PsiInternalKobold.g:3695:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // PsiInternalKobold.g:3695:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    // PsiInternalKobold.g:3696:6: lv_expressions_2_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getXBlockExpression_ExpressionsXExpressionOrVarDeclarationParserRuleCall_2_0_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_expressions_2_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }

            	    // PsiInternalKobold.g:3709:4: (otherlv_3= ';' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==58) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // PsiInternalKobold.g:3710:5: otherlv_3= ';'
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getXBlockExpression_SemicolonKeyword_2_1ElementType());
            	              				
            	            }
            	            otherlv_3=(Token)match(input,58,FOLLOW_62); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(otherlv_3);
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXBlockExpression_RightCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionOrVarDeclaration"
    // PsiInternalKobold.g:3730:1: entryRuleXExpressionOrVarDeclaration returns [Boolean current=false] : iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF ;
    public final Boolean entryRuleXExpressionOrVarDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXExpressionOrVarDeclaration = null;


        try {
            // PsiInternalKobold.g:3730:69: (iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF )
            // PsiInternalKobold.g:3731:2: iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXExpressionOrVarDeclarationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionOrVarDeclaration=ruleXExpressionOrVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionOrVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionOrVarDeclaration"


    // $ANTLR start "ruleXExpressionOrVarDeclaration"
    // PsiInternalKobold.g:3737:1: ruleXExpressionOrVarDeclaration returns [Boolean current=false] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final Boolean ruleXExpressionOrVarDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean this_XVariableDeclaration_0 = null;

        Boolean this_XExpression_1 = null;


        try {
            // PsiInternalKobold.g:3738:1: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // PsiInternalKobold.g:3739:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // PsiInternalKobold.g:3739:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=68 && LA63_0<=69)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_DECIMAL)||LA63_0==14||LA63_0==21||(LA63_0>=37 && LA63_0<=38)||LA63_0==50||(LA63_0>=52 && LA63_0<=53)||LA63_0==55||LA63_0==59||LA63_0==61||(LA63_0>=65 && LA63_0<=67)||(LA63_0>=70 && LA63_0<=82)||LA63_0==84) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // PsiInternalKobold.g:3740:3: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXExpressionOrVarDeclaration_XVariableDeclarationParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XVariableDeclaration_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:3749:3: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getXExpressionOrVarDeclaration_XExpressionParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XExpression_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionOrVarDeclaration"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // PsiInternalKobold.g:3761:1: entryRuleXVariableDeclaration returns [Boolean current=false] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final Boolean entryRuleXVariableDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXVariableDeclaration = null;


        try {
            // PsiInternalKobold.g:3761:62: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // PsiInternalKobold.g:3762:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXVariableDeclarationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // PsiInternalKobold.g:3768:1: ruleXVariableDeclaration returns [Boolean current=false] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final Boolean ruleXVariableDeclaration() throws RecognitionException {
        Boolean current = false;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Boolean lv_type_3_0 = null;

        Boolean lv_name_4_0 = null;

        Boolean lv_name_5_0 = null;

        Boolean lv_right_7_0 = null;


        try {
            // PsiInternalKobold.g:3769:1: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // PsiInternalKobold.g:3770:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // PsiInternalKobold.g:3770:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // PsiInternalKobold.g:3771:3: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // PsiInternalKobold.g:3771:3: ()
            // PsiInternalKobold.g:3772:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXVariableDeclaration_XVariableDeclarationAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:3778:3: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==68) ) {
                alt64=1;
            }
            else if ( (LA64_0==69) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // PsiInternalKobold.g:3779:4: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // PsiInternalKobold.g:3779:4: ( (lv_writeable_1_0= 'var' ) )
                    // PsiInternalKobold.g:3780:5: (lv_writeable_1_0= 'var' )
                    {
                    // PsiInternalKobold.g:3780:5: (lv_writeable_1_0= 'var' )
                    // PsiInternalKobold.g:3781:6: lv_writeable_1_0= 'var'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getXVariableDeclaration_WriteableVarKeyword_1_0_0ElementType());
                      					
                    }
                    lv_writeable_1_0=(Token)match(input,68,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_writeable_1_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:3797:4: otherlv_2= 'val'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXVariableDeclaration_ValKeyword_1_1ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,69,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalKobold.g:3805:3: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred29_PsiInternalKobold()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA65_0==50) && (synpred29_PsiInternalKobold())) {
                alt65=1;
            }
            else if ( (LA65_0==34) && (synpred29_PsiInternalKobold())) {
                alt65=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // PsiInternalKobold.g:3806:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // PsiInternalKobold.g:3806:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // PsiInternalKobold.g:3807:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // PsiInternalKobold.g:3820:5: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // PsiInternalKobold.g:3821:6: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // PsiInternalKobold.g:3821:6: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // PsiInternalKobold.g:3822:7: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // PsiInternalKobold.g:3822:7: (lv_type_3_0= ruleJvmTypeReference )
                    // PsiInternalKobold.g:3823:8: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      								markComposite(elementTypeProvider.getXVariableDeclaration_TypeJvmTypeReferenceParserRuleCall_2_0_0_0_0ElementType());
                      							
                    }
                    pushFollow(FOLLOW_4);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								doneComposite();
                      								if(!current) {
                      									associateWithSemanticElement();
                      									current = true;
                      								}
                      							
                    }

                    }


                    }

                    // PsiInternalKobold.g:3836:6: ( (lv_name_4_0= ruleValidID ) )
                    // PsiInternalKobold.g:3837:7: (lv_name_4_0= ruleValidID )
                    {
                    // PsiInternalKobold.g:3837:7: (lv_name_4_0= ruleValidID )
                    // PsiInternalKobold.g:3838:8: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      								markComposite(elementTypeProvider.getXVariableDeclaration_NameValidIDParserRuleCall_2_0_0_1_0ElementType());
                      							
                    }
                    pushFollow(FOLLOW_64);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								doneComposite();
                      								if(!current) {
                      									associateWithSemanticElement();
                      									current = true;
                      								}
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:3854:4: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // PsiInternalKobold.g:3854:4: ( (lv_name_5_0= ruleValidID ) )
                    // PsiInternalKobold.g:3855:5: (lv_name_5_0= ruleValidID )
                    {
                    // PsiInternalKobold.g:3855:5: (lv_name_5_0= ruleValidID )
                    // PsiInternalKobold.g:3856:6: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXVariableDeclaration_NameValidIDParserRuleCall_2_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:3870:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalKobold.g:3871:4: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXVariableDeclaration_EqualsSignKeyword_3_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalKobold.g:3878:4: ( (lv_right_7_0= ruleXExpression ) )
                    // PsiInternalKobold.g:3879:5: (lv_right_7_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:3879:5: (lv_right_7_0= ruleXExpression )
                    // PsiInternalKobold.g:3880:6: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXVariableDeclaration_RightXExpressionParserRuleCall_3_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // PsiInternalKobold.g:3898:1: entryRuleJvmFormalParameter returns [Boolean current=false] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final Boolean entryRuleJvmFormalParameter() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmFormalParameter = null;


        try {
            // PsiInternalKobold.g:3898:60: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // PsiInternalKobold.g:3899:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmFormalParameterElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // PsiInternalKobold.g:3905:1: ruleJvmFormalParameter returns [Boolean current=false] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final Boolean ruleJvmFormalParameter() throws RecognitionException {
        Boolean current = false;

        Boolean lv_parameterType_0_0 = null;

        Boolean lv_name_1_0 = null;


        try {
            // PsiInternalKobold.g:3906:1: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // PsiInternalKobold.g:3907:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // PsiInternalKobold.g:3907:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // PsiInternalKobold.g:3908:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // PsiInternalKobold.g:3908:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==RULE_ID||LA67_1==21||LA67_1==46||LA67_1==55) ) {
                    alt67=1;
                }
            }
            else if ( (LA67_0==34||LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // PsiInternalKobold.g:3909:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // PsiInternalKobold.g:3909:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // PsiInternalKobold.g:3910:5: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getJvmFormalParameter_ParameterTypeJvmTypeReferenceParserRuleCall_0_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:3923:3: ( (lv_name_1_0= ruleValidID ) )
            // PsiInternalKobold.g:3924:4: (lv_name_1_0= ruleValidID )
            {
            // PsiInternalKobold.g:3924:4: (lv_name_1_0= ruleValidID )
            // PsiInternalKobold.g:3925:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmFormalParameter_NameValidIDParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // PsiInternalKobold.g:3942:1: entryRuleFullJvmFormalParameter returns [Boolean current=false] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final Boolean entryRuleFullJvmFormalParameter() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFullJvmFormalParameter = null;


        try {
            // PsiInternalKobold.g:3942:64: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // PsiInternalKobold.g:3943:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFullJvmFormalParameterElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // PsiInternalKobold.g:3949:1: ruleFullJvmFormalParameter returns [Boolean current=false] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final Boolean ruleFullJvmFormalParameter() throws RecognitionException {
        Boolean current = false;

        Boolean lv_parameterType_0_0 = null;

        Boolean lv_name_1_0 = null;


        try {
            // PsiInternalKobold.g:3950:1: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // PsiInternalKobold.g:3951:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // PsiInternalKobold.g:3951:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // PsiInternalKobold.g:3952:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // PsiInternalKobold.g:3952:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:3953:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:3953:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:3954:5: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getFullJvmFormalParameter_ParameterTypeJvmTypeReferenceParserRuleCall_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_4);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalKobold.g:3967:3: ( (lv_name_1_0= ruleValidID ) )
            // PsiInternalKobold.g:3968:4: (lv_name_1_0= ruleValidID )
            {
            // PsiInternalKobold.g:3968:4: (lv_name_1_0= ruleValidID )
            // PsiInternalKobold.g:3969:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getFullJvmFormalParameter_NameValidIDParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // PsiInternalKobold.g:3986:1: entryRuleXFeatureCall returns [Boolean current=false] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final Boolean entryRuleXFeatureCall() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXFeatureCall = null;


        try {
            // PsiInternalKobold.g:3986:54: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // PsiInternalKobold.g:3987:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXFeatureCallElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // PsiInternalKobold.g:3993:1: ruleXFeatureCall returns [Boolean current=false] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
    public final Boolean ruleXFeatureCall() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Boolean lv_typeArguments_2_0 = null;

        Boolean lv_typeArguments_4_0 = null;

        Boolean lv_featureCallArguments_8_0 = null;

        Boolean lv_featureCallArguments_9_0 = null;

        Boolean lv_featureCallArguments_11_0 = null;

        Boolean lv_featureCallArguments_13_0 = null;


        try {
            // PsiInternalKobold.g:3994:1: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // PsiInternalKobold.g:3995:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // PsiInternalKobold.g:3995:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // PsiInternalKobold.g:3996:3: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // PsiInternalKobold.g:3996:3: ()
            // PsiInternalKobold.g:3997:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXFeatureCall_XFeatureCallAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:4003:3: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==21) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // PsiInternalKobold.g:4004:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXFeatureCall_LessThanSignKeyword_1_0ElementType());
                      			
                    }
                    otherlv_1=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_1);
                      			
                    }
                    // PsiInternalKobold.g:4011:4: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // PsiInternalKobold.g:4012:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // PsiInternalKobold.g:4012:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // PsiInternalKobold.g:4013:6: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXFeatureCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:4026:4: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==49) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // PsiInternalKobold.g:4027:5: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXFeatureCall_CommaKeyword_1_2_0ElementType());
                    	      				
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_3);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:4034:5: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // PsiInternalKobold.g:4035:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // PsiInternalKobold.g:4035:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // PsiInternalKobold.g:4036:7: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXFeatureCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXFeatureCall_GreaterThanSignKeyword_1_3ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,22,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalKobold.g:4058:3: ( ( ruleIdOrSuper ) )
            // PsiInternalKobold.g:4059:4: ( ruleIdOrSuper )
            {
            // PsiInternalKobold.g:4059:4: ( ruleIdOrSuper )
            // PsiInternalKobold.g:4060:5: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXFeatureCall_FeatureJvmIdentifiableElementCrossReference_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_65);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalKobold.g:4075:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // PsiInternalKobold.g:4076:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // PsiInternalKobold.g:4076:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // PsiInternalKobold.g:4077:5: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // PsiInternalKobold.g:4081:5: (lv_explicitOperationCall_7_0= '(' )
                    // PsiInternalKobold.g:4082:6: lv_explicitOperationCall_7_0= '('
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getXFeatureCall_ExplicitOperationCallLeftParenthesisKeyword_3_0_0ElementType());
                      					
                    }
                    lv_explicitOperationCall_7_0=(Token)match(input,50,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_explicitOperationCall_7_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:4097:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt71=3;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // PsiInternalKobold.g:4098:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // PsiInternalKobold.g:4098:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // PsiInternalKobold.g:4099:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // PsiInternalKobold.g:4124:6: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // PsiInternalKobold.g:4125:7: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getXFeatureCall_FeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_32);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:4139:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // PsiInternalKobold.g:4139:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // PsiInternalKobold.g:4140:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // PsiInternalKobold.g:4140:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // PsiInternalKobold.g:4141:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // PsiInternalKobold.g:4141:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            // PsiInternalKobold.g:4142:8: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getXFeatureCall_FeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_33);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalKobold.g:4155:6: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==49) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // PsiInternalKobold.g:4156:7: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getXFeatureCall_CommaKeyword_3_1_1_1_0ElementType());
                            	      						
                            	    }
                            	    otherlv_10=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(otherlv_10);
                            	      						
                            	    }
                            	    // PsiInternalKobold.g:4163:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // PsiInternalKobold.g:4164:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // PsiInternalKobold.g:4164:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // PsiInternalKobold.g:4165:9: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									markComposite(elementTypeProvider.getXFeatureCall_FeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0ElementType());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_33);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									doneComposite();
                            	      									if(!current) {
                            	      										associateWithSemanticElement();
                            	      										current = true;
                            	      									}
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXFeatureCall_RightParenthesisKeyword_3_2ElementType());
                      			
                    }
                    otherlv_12=(Token)match(input,51,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_12);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalKobold.g:4189:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // PsiInternalKobold.g:4190:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // PsiInternalKobold.g:4196:4: (lv_featureCallArguments_13_0= ruleXClosure )
                    // PsiInternalKobold.g:4197:5: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getXFeatureCall_FeatureCallArgumentsXClosureParserRuleCall_4_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_featureCallArguments_13_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // PsiInternalKobold.g:4214:1: entryRuleFeatureCallID returns [Boolean current=false] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final Boolean entryRuleFeatureCallID() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFeatureCallID = null;


        try {
            // PsiInternalKobold.g:4214:55: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // PsiInternalKobold.g:4215:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFeatureCallIDElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // PsiInternalKobold.g:4221:1: ruleFeatureCallID returns [Boolean current=false] : ( ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final Boolean ruleFeatureCallID() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:4222:1: ( ( ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // PsiInternalKobold.g:4223:2: ( ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // PsiInternalKobold.g:4223:2: ( ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt74=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt74=1;
                }
                break;
            case 70:
                {
                alt74=2;
                }
                break;
            case 71:
                {
                alt74=3;
                }
                break;
            case 72:
                {
                alt74=4;
                }
                break;
            case 73:
                {
                alt74=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // PsiInternalKobold.g:4224:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFeatureCallID_ValidIDParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:4232:3: kw= 'extends'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getFeatureCallID_ExtendsKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:4240:3: kw= 'static'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getFeatureCallID_StaticKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalKobold.g:4248:3: kw= 'import'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getFeatureCallID_ImportKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalKobold.g:4256:3: kw= 'extension'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getFeatureCallID_ExtensionKeyword_4ElementType());
                      		
                    }
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // PsiInternalKobold.g:4267:1: entryRuleIdOrSuper returns [Boolean current=false] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final Boolean entryRuleIdOrSuper() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIdOrSuper = null;


        try {
            // PsiInternalKobold.g:4267:51: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // PsiInternalKobold.g:4268:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIdOrSuperElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // PsiInternalKobold.g:4274:1: ruleIdOrSuper returns [Boolean current=false] : ( ruleFeatureCallID | kw= 'super' ) ;
    public final Boolean ruleIdOrSuper() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:4275:1: ( ( ruleFeatureCallID | kw= 'super' ) )
            // PsiInternalKobold.g:4276:2: ( ruleFeatureCallID | kw= 'super' )
            {
            // PsiInternalKobold.g:4276:2: ( ruleFeatureCallID | kw= 'super' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||(LA75_0>=70 && LA75_0<=73)) ) {
                alt75=1;
            }
            else if ( (LA75_0==74) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // PsiInternalKobold.g:4277:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getIdOrSuper_FeatureCallIDParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:4285:3: kw= 'super'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getIdOrSuper_SuperKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleXConstructorCall"
    // PsiInternalKobold.g:4296:1: entryRuleXConstructorCall returns [Boolean current=false] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final Boolean entryRuleXConstructorCall() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXConstructorCall = null;


        try {
            // PsiInternalKobold.g:4296:58: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // PsiInternalKobold.g:4297:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXConstructorCallElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // PsiInternalKobold.g:4303:1: ruleXConstructorCall returns [Boolean current=false] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final Boolean ruleXConstructorCall() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_explicitConstructorCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Boolean lv_typeArguments_4_0 = null;

        Boolean lv_typeArguments_6_0 = null;

        Boolean lv_arguments_9_0 = null;

        Boolean lv_arguments_10_0 = null;

        Boolean lv_arguments_12_0 = null;

        Boolean lv_arguments_14_0 = null;


        try {
            // PsiInternalKobold.g:4304:1: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // PsiInternalKobold.g:4305:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // PsiInternalKobold.g:4305:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // PsiInternalKobold.g:4306:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // PsiInternalKobold.g:4306:3: ()
            // PsiInternalKobold.g:4307:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXConstructorCall_XConstructorCallAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXConstructorCall_NewKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:4320:3: ( ( ruleQualifiedName ) )
            // PsiInternalKobold.g:4321:4: ( ruleQualifiedName )
            {
            // PsiInternalKobold.g:4321:4: ( ruleQualifiedName )
            // PsiInternalKobold.g:4322:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXConstructorCall_ConstructorJvmConstructorCrossReference_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_67);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalKobold.g:4337:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // PsiInternalKobold.g:4338:4: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // PsiInternalKobold.g:4338:4: ( ( '<' )=>otherlv_3= '<' )
                    // PsiInternalKobold.g:4339:5: ( '<' )=>otherlv_3= '<'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getXConstructorCall_LessThanSignKeyword_3_0ElementType());
                      				
                    }
                    otherlv_3=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_3);
                      				
                    }

                    }

                    // PsiInternalKobold.g:4348:4: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // PsiInternalKobold.g:4349:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // PsiInternalKobold.g:4349:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // PsiInternalKobold.g:4350:6: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXConstructorCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:4363:4: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==49) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // PsiInternalKobold.g:4364:5: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getXConstructorCall_CommaKeyword_3_2_0ElementType());
                    	      				
                    	    }
                    	    otherlv_5=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_5);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:4371:5: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // PsiInternalKobold.g:4372:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // PsiInternalKobold.g:4372:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // PsiInternalKobold.g:4373:7: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXConstructorCall_TypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXConstructorCall_GreaterThanSignKeyword_3_3ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,22,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalKobold.g:4395:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // PsiInternalKobold.g:4396:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // PsiInternalKobold.g:4396:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) )
                    // PsiInternalKobold.g:4397:5: ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' )
                    {
                    // PsiInternalKobold.g:4401:5: (lv_explicitConstructorCall_8_0= '(' )
                    // PsiInternalKobold.g:4402:6: lv_explicitConstructorCall_8_0= '('
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getXConstructorCall_ExplicitConstructorCallLeftParenthesisKeyword_4_0_0ElementType());
                      					
                    }
                    lv_explicitConstructorCall_8_0=(Token)match(input,50,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_explicitConstructorCall_8_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:4417:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt79=3;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // PsiInternalKobold.g:4418:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // PsiInternalKobold.g:4418:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // PsiInternalKobold.g:4419:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // PsiInternalKobold.g:4444:6: (lv_arguments_9_0= ruleXShortClosure )
                            // PsiInternalKobold.g:4445:7: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getXConstructorCall_ArgumentsXShortClosureParserRuleCall_4_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_32);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:4459:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // PsiInternalKobold.g:4459:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // PsiInternalKobold.g:4460:6: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // PsiInternalKobold.g:4460:6: ( (lv_arguments_10_0= ruleXExpression ) )
                            // PsiInternalKobold.g:4461:7: (lv_arguments_10_0= ruleXExpression )
                            {
                            // PsiInternalKobold.g:4461:7: (lv_arguments_10_0= ruleXExpression )
                            // PsiInternalKobold.g:4462:8: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getXConstructorCall_ArgumentsXExpressionParserRuleCall_4_1_1_0_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_33);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalKobold.g:4475:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==49) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // PsiInternalKobold.g:4476:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getXConstructorCall_CommaKeyword_4_1_1_1_0ElementType());
                            	      						
                            	    }
                            	    otherlv_11=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(otherlv_11);
                            	      						
                            	    }
                            	    // PsiInternalKobold.g:4483:7: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // PsiInternalKobold.g:4484:8: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // PsiInternalKobold.g:4484:8: (lv_arguments_12_0= ruleXExpression )
                            	    // PsiInternalKobold.g:4485:9: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									markComposite(elementTypeProvider.getXConstructorCall_ArgumentsXExpressionParserRuleCall_4_1_1_1_1_0ElementType());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_33);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									doneComposite();
                            	      									if(!current) {
                            	      										associateWithSemanticElement();
                            	      										current = true;
                            	      									}
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop78;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXConstructorCall_RightParenthesisKeyword_4_2ElementType());
                      			
                    }
                    otherlv_13=(Token)match(input,51,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_13);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalKobold.g:4509:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // PsiInternalKobold.g:4510:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // PsiInternalKobold.g:4516:4: (lv_arguments_14_0= ruleXClosure )
                    // PsiInternalKobold.g:4517:5: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getXConstructorCall_ArgumentsXClosureParserRuleCall_5_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // PsiInternalKobold.g:4534:1: entryRuleXBooleanLiteral returns [Boolean current=false] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final Boolean entryRuleXBooleanLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXBooleanLiteral = null;


        try {
            // PsiInternalKobold.g:4534:57: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // PsiInternalKobold.g:4535:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXBooleanLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // PsiInternalKobold.g:4541:1: ruleXBooleanLiteral returns [Boolean current=false] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final Boolean ruleXBooleanLiteral() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

        try {
            // PsiInternalKobold.g:4542:1: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // PsiInternalKobold.g:4543:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // PsiInternalKobold.g:4543:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // PsiInternalKobold.g:4544:3: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // PsiInternalKobold.g:4544:3: ()
            // PsiInternalKobold.g:4545:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXBooleanLiteral_XBooleanLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:4551:3: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==76) ) {
                alt82=1;
            }
            else if ( (LA82_0==77) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // PsiInternalKobold.g:4552:4: otherlv_1= 'false'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXBooleanLiteral_FalseKeyword_1_0ElementType());
                      			
                    }
                    otherlv_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_1);
                      			
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:4560:4: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // PsiInternalKobold.g:4560:4: ( (lv_isTrue_2_0= 'true' ) )
                    // PsiInternalKobold.g:4561:5: (lv_isTrue_2_0= 'true' )
                    {
                    // PsiInternalKobold.g:4561:5: (lv_isTrue_2_0= 'true' )
                    // PsiInternalKobold.g:4562:6: lv_isTrue_2_0= 'true'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getXBooleanLiteral_IsTrueTrueKeyword_1_1_0ElementType());
                      					
                    }
                    lv_isTrue_2_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_isTrue_2_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // PsiInternalKobold.g:4582:1: entryRuleXNullLiteral returns [Boolean current=false] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final Boolean entryRuleXNullLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXNullLiteral = null;


        try {
            // PsiInternalKobold.g:4582:54: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // PsiInternalKobold.g:4583:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXNullLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // PsiInternalKobold.g:4589:1: ruleXNullLiteral returns [Boolean current=false] : ( () otherlv_1= 'null' ) ;
    public final Boolean ruleXNullLiteral() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;

        try {
            // PsiInternalKobold.g:4590:1: ( ( () otherlv_1= 'null' ) )
            // PsiInternalKobold.g:4591:2: ( () otherlv_1= 'null' )
            {
            // PsiInternalKobold.g:4591:2: ( () otherlv_1= 'null' )
            // PsiInternalKobold.g:4592:3: () otherlv_1= 'null'
            {
            // PsiInternalKobold.g:4592:3: ()
            // PsiInternalKobold.g:4593:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXNullLiteral_XNullLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXNullLiteral_NullKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // PsiInternalKobold.g:4610:1: entryRuleXNumberLiteral returns [Boolean current=false] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final Boolean entryRuleXNumberLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXNumberLiteral = null;


        try {
            // PsiInternalKobold.g:4610:56: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // PsiInternalKobold.g:4611:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXNumberLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // PsiInternalKobold.g:4617:1: ruleXNumberLiteral returns [Boolean current=false] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final Boolean ruleXNumberLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_1_0 = null;


        try {
            // PsiInternalKobold.g:4618:1: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // PsiInternalKobold.g:4619:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // PsiInternalKobold.g:4619:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // PsiInternalKobold.g:4620:3: () ( (lv_value_1_0= ruleNumber ) )
            {
            // PsiInternalKobold.g:4620:3: ()
            // PsiInternalKobold.g:4621:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXNumberLiteral_XNumberLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:4627:3: ( (lv_value_1_0= ruleNumber ) )
            // PsiInternalKobold.g:4628:4: (lv_value_1_0= ruleNumber )
            {
            // PsiInternalKobold.g:4628:4: (lv_value_1_0= ruleNumber )
            // PsiInternalKobold.g:4629:5: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXNumberLiteral_ValueNumberParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // PsiInternalKobold.g:4646:1: entryRuleXStringLiteral returns [Boolean current=false] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final Boolean entryRuleXStringLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXStringLiteral = null;


        try {
            // PsiInternalKobold.g:4646:56: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // PsiInternalKobold.g:4647:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXStringLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // PsiInternalKobold.g:4653:1: ruleXStringLiteral returns [Boolean current=false] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleXStringLiteral() throws RecognitionException {
        Boolean current = false;

        Token lv_value_1_0=null;

        try {
            // PsiInternalKobold.g:4654:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // PsiInternalKobold.g:4655:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // PsiInternalKobold.g:4655:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // PsiInternalKobold.g:4656:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // PsiInternalKobold.g:4656:3: ()
            // PsiInternalKobold.g:4657:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXStringLiteral_XStringLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalKobold.g:4663:3: ( (lv_value_1_0= RULE_STRING ) )
            // PsiInternalKobold.g:4664:4: (lv_value_1_0= RULE_STRING )
            {
            // PsiInternalKobold.g:4664:4: (lv_value_1_0= RULE_STRING )
            // PsiInternalKobold.g:4665:5: lv_value_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXStringLiteral_ValueSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_value_1_0);
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // PsiInternalKobold.g:4684:1: entryRuleXTypeLiteral returns [Boolean current=false] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final Boolean entryRuleXTypeLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXTypeLiteral = null;


        try {
            // PsiInternalKobold.g:4684:54: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // PsiInternalKobold.g:4685:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXTypeLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // PsiInternalKobold.g:4691:1: ruleXTypeLiteral returns [Boolean current=false] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final Boolean ruleXTypeLiteral() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Boolean lv_arrayDimensions_4_0 = null;


        try {
            // PsiInternalKobold.g:4692:1: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // PsiInternalKobold.g:4693:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // PsiInternalKobold.g:4693:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // PsiInternalKobold.g:4694:3: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // PsiInternalKobold.g:4694:3: ()
            // PsiInternalKobold.g:4695:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXTypeLiteral_XTypeLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXTypeLiteral_TypeofKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,79,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXTypeLiteral_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalKobold.g:4715:3: ( ( ruleQualifiedName ) )
            // PsiInternalKobold.g:4716:4: ( ruleQualifiedName )
            {
            // PsiInternalKobold.g:4716:4: ( ruleQualifiedName )
            // PsiInternalKobold.g:4717:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXTypeLiteral_TypeJvmTypeCrossReference_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_68);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalKobold.g:4732:3: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==55) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // PsiInternalKobold.g:4733:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // PsiInternalKobold.g:4733:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // PsiInternalKobold.g:4734:5: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getXTypeLiteral_ArrayDimensionsArrayBracketsParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXTypeLiteral_RightParenthesisKeyword_5ElementType());
              		
            }
            otherlv_5=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // PsiInternalKobold.g:4758:1: entryRuleXThrowExpression returns [Boolean current=false] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final Boolean entryRuleXThrowExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXThrowExpression = null;


        try {
            // PsiInternalKobold.g:4758:58: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // PsiInternalKobold.g:4759:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXThrowExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // PsiInternalKobold.g:4765:1: ruleXThrowExpression returns [Boolean current=false] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXThrowExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Boolean lv_expression_2_0 = null;


        try {
            // PsiInternalKobold.g:4766:1: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:4767:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:4767:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:4768:3: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:4768:3: ()
            // PsiInternalKobold.g:4769:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXThrowExpression_XThrowExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXThrowExpression_ThrowKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,80,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:4782:3: ( (lv_expression_2_0= ruleXExpression ) )
            // PsiInternalKobold.g:4783:4: (lv_expression_2_0= ruleXExpression )
            {
            // PsiInternalKobold.g:4783:4: (lv_expression_2_0= ruleXExpression )
            // PsiInternalKobold.g:4784:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXThrowExpression_ExpressionXExpressionParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // PsiInternalKobold.g:4801:1: entryRuleXReturnExpression returns [Boolean current=false] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final Boolean entryRuleXReturnExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXReturnExpression = null;


        try {
            // PsiInternalKobold.g:4801:59: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // PsiInternalKobold.g:4802:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXReturnExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // PsiInternalKobold.g:4808:1: ruleXReturnExpression returns [Boolean current=false] : ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final Boolean ruleXReturnExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Boolean lv_expression_2_0 = null;


        try {
            // PsiInternalKobold.g:4809:1: ( ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // PsiInternalKobold.g:4810:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // PsiInternalKobold.g:4810:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            // PsiInternalKobold.g:4811:3: () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // PsiInternalKobold.g:4811:3: ()
            // PsiInternalKobold.g:4812:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXReturnExpression_XReturnExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXReturnExpression_ReturnKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,81,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:4825:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // PsiInternalKobold.g:4826:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:4827:4: (lv_expression_2_0= ruleXExpression )
                    // PsiInternalKobold.g:4828:5: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getXReturnExpression_ExpressionXExpressionParserRuleCall_2_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // PsiInternalKobold.g:4845:1: entryRuleXTryCatchFinallyExpression returns [Boolean current=false] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final Boolean entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXTryCatchFinallyExpression = null;


        try {
            // PsiInternalKobold.g:4845:68: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // PsiInternalKobold.g:4846:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXTryCatchFinallyExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // PsiInternalKobold.g:4852:1: ruleXTryCatchFinallyExpression returns [Boolean current=false] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final Boolean ruleXTryCatchFinallyExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_expression_2_0 = null;

        Boolean lv_catchClauses_3_0 = null;

        Boolean lv_finallyExpression_5_0 = null;

        Boolean lv_finallyExpression_7_0 = null;


        try {
            // PsiInternalKobold.g:4853:1: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // PsiInternalKobold.g:4854:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // PsiInternalKobold.g:4854:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // PsiInternalKobold.g:4855:3: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // PsiInternalKobold.g:4855:3: ()
            // PsiInternalKobold.g:4856:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getXTryCatchFinallyExpression_XTryCatchFinallyExpressionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXTryCatchFinallyExpression_TryKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,82,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:4869:3: ( (lv_expression_2_0= ruleXExpression ) )
            // PsiInternalKobold.g:4870:4: (lv_expression_2_0= ruleXExpression )
            {
            // PsiInternalKobold.g:4870:4: (lv_expression_2_0= ruleXExpression )
            // PsiInternalKobold.g:4871:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXTryCatchFinallyExpression_ExpressionXExpressionParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_70);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalKobold.g:4884:3: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==85) ) {
                alt87=1;
            }
            else if ( (LA87_0==83) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // PsiInternalKobold.g:4885:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // PsiInternalKobold.g:4885:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // PsiInternalKobold.g:4886:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // PsiInternalKobold.g:4886:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==85) ) {
                            int LA85_2 = input.LA(2);

                            if ( (synpred38_PsiInternalKobold()) ) {
                                alt85=1;
                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // PsiInternalKobold.g:4887:6: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // PsiInternalKobold.g:4888:6: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // PsiInternalKobold.g:4889:7: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getXTryCatchFinallyExpression_CatchClausesXCatchClauseParserRuleCall_3_0_0_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_71);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    // PsiInternalKobold.g:4902:5: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==83) ) {
                        int LA86_1 = input.LA(2);

                        if ( (synpred39_PsiInternalKobold()) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // PsiInternalKobold.g:4903:6: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // PsiInternalKobold.g:4903:6: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // PsiInternalKobold.g:4904:7: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getXTryCatchFinallyExpression_FinallyKeyword_3_0_1_0ElementType());
                              						
                            }
                            otherlv_4=(Token)match(input,83,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(otherlv_4);
                              						
                            }

                            }

                            // PsiInternalKobold.g:4913:6: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // PsiInternalKobold.g:4914:7: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // PsiInternalKobold.g:4914:7: (lv_finallyExpression_5_0= ruleXExpression )
                            // PsiInternalKobold.g:4915:8: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getXTryCatchFinallyExpression_FinallyExpressionXExpressionParserRuleCall_3_0_1_1_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:4931:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // PsiInternalKobold.g:4931:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // PsiInternalKobold.g:4932:5: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getXTryCatchFinallyExpression_FinallyKeyword_3_1_0ElementType());
                      				
                    }
                    otherlv_6=(Token)match(input,83,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_6);
                      				
                    }
                    // PsiInternalKobold.g:4939:5: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // PsiInternalKobold.g:4940:6: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // PsiInternalKobold.g:4940:6: (lv_finallyExpression_7_0= ruleXExpression )
                    // PsiInternalKobold.g:4941:7: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXTryCatchFinallyExpression_FinallyExpressionXExpressionParserRuleCall_3_1_1_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXSynchronizedExpression"
    // PsiInternalKobold.g:4960:1: entryRuleXSynchronizedExpression returns [Boolean current=false] : iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF ;
    public final Boolean entryRuleXSynchronizedExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXSynchronizedExpression = null;


        try {
            // PsiInternalKobold.g:4960:65: (iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF )
            // PsiInternalKobold.g:4961:2: iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXSynchronizedExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSynchronizedExpression=ruleXSynchronizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSynchronizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSynchronizedExpression"


    // $ANTLR start "ruleXSynchronizedExpression"
    // PsiInternalKobold.g:4967:1: ruleXSynchronizedExpression returns [Boolean current=false] : ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXSynchronizedExpression() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_param_3_0 = null;

        Boolean lv_expression_5_0 = null;


        try {
            // PsiInternalKobold.g:4968:1: ( ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:4969:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:4969:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:4970:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:4970:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) )
            // PsiInternalKobold.g:4971:4: ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            {
            // PsiInternalKobold.g:4978:4: ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            // PsiInternalKobold.g:4979:5: () otherlv_1= 'synchronized' otherlv_2= '('
            {
            // PsiInternalKobold.g:4979:5: ()
            // PsiInternalKobold.g:4980:6: 
            {
            if ( state.backtracking==0 ) {

              						precedeComposite(elementTypeProvider.getXSynchronizedExpression_XSynchronizedExpressionAction_0_0_0ElementType());
              						doneComposite();
              						associateWithSemanticElement();
              					
            }

            }

            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXSynchronizedExpression_SynchronizedKeyword_0_0_1ElementType());
              				
            }
            otherlv_1=(Token)match(input,84,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_1);
              				
            }
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXSynchronizedExpression_LeftParenthesisKeyword_0_0_2ElementType());
              				
            }
            otherlv_2=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneLeaf(otherlv_2);
              				
            }

            }


            }

            // PsiInternalKobold.g:5002:3: ( (lv_param_3_0= ruleXExpression ) )
            // PsiInternalKobold.g:5003:4: (lv_param_3_0= ruleXExpression )
            {
            // PsiInternalKobold.g:5003:4: (lv_param_3_0= ruleXExpression )
            // PsiInternalKobold.g:5004:5: lv_param_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXSynchronizedExpression_ParamXExpressionParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_param_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXSynchronizedExpression_RightParenthesisKeyword_2ElementType());
              		
            }
            otherlv_4=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalKobold.g:5024:3: ( (lv_expression_5_0= ruleXExpression ) )
            // PsiInternalKobold.g:5025:4: (lv_expression_5_0= ruleXExpression )
            {
            // PsiInternalKobold.g:5025:4: (lv_expression_5_0= ruleXExpression )
            // PsiInternalKobold.g:5026:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXSynchronizedExpression_ExpressionXExpressionParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSynchronizedExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // PsiInternalKobold.g:5043:1: entryRuleXCatchClause returns [Boolean current=false] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final Boolean entryRuleXCatchClause() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXCatchClause = null;


        try {
            // PsiInternalKobold.g:5043:54: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // PsiInternalKobold.g:5044:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXCatchClauseElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // PsiInternalKobold.g:5050:1: ruleXCatchClause returns [Boolean current=false] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final Boolean ruleXCatchClause() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_declaredParam_2_0 = null;

        Boolean lv_expression_4_0 = null;


        try {
            // PsiInternalKobold.g:5051:1: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // PsiInternalKobold.g:5052:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // PsiInternalKobold.g:5052:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // PsiInternalKobold.g:5053:3: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // PsiInternalKobold.g:5053:3: ( ( 'catch' )=>otherlv_0= 'catch' )
            // PsiInternalKobold.g:5054:4: ( 'catch' )=>otherlv_0= 'catch'
            {
            if ( state.backtracking==0 ) {

              				markLeaf(elementTypeProvider.getXCatchClause_CatchKeyword_0ElementType());
              			
            }
            otherlv_0=(Token)match(input,85,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				doneLeaf(otherlv_0);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXCatchClause_LeftParenthesisKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:5070:3: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // PsiInternalKobold.g:5071:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // PsiInternalKobold.g:5071:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // PsiInternalKobold.g:5072:5: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXCatchClause_DeclaredParamFullJvmFormalParameterParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXCatchClause_RightParenthesisKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalKobold.g:5092:3: ( (lv_expression_4_0= ruleXExpression ) )
            // PsiInternalKobold.g:5093:4: (lv_expression_4_0= ruleXExpression )
            {
            // PsiInternalKobold.g:5093:4: (lv_expression_4_0= ruleXExpression )
            // PsiInternalKobold.g:5094:5: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXCatchClause_ExpressionXExpressionParserRuleCall_4_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalKobold.g:5111:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalKobold.g:5111:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalKobold.g:5112:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalKobold.g:5118:1: ruleQualifiedName returns [Boolean current=false] : ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:5119:1: ( ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* ) )
            // PsiInternalKobold.g:5120:2: ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* )
            {
            // PsiInternalKobold.g:5120:2: ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* )
            // PsiInternalKobold.g:5121:3: ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getQualifiedName_ValidIDParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_72);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }
            // PsiInternalKobold.g:5128:3: ( ( ( '.' )=>kw= '.' ) ruleValidID )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==46) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==RULE_ID) ) {
                        int LA88_3 = input.LA(3);

                        if ( (synpred42_PsiInternalKobold()) ) {
                            alt88=1;
                        }


                    }


                }


                switch (alt88) {
            	case 1 :
            	    // PsiInternalKobold.g:5129:4: ( ( '.' )=>kw= '.' ) ruleValidID
            	    {
            	    // PsiInternalKobold.g:5129:4: ( ( '.' )=>kw= '.' )
            	    // PsiInternalKobold.g:5130:5: ( '.' )=>kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	      				
            	    }
            	    kw=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(kw);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				markComposite(elementTypeProvider.getQualifiedName_ValidIDParserRuleCall_1_1ElementType());
            	      			
            	    }
            	    pushFollow(FOLLOW_72);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneComposite();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // PsiInternalKobold.g:5151:1: entryRuleNumber returns [Boolean current=false] : iv_ruleNumber= ruleNumber EOF ;
    public final Boolean entryRuleNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalKobold.g:5153:2: (iv_ruleNumber= ruleNumber EOF )
            // PsiInternalKobold.g:5154:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getNumberElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // PsiInternalKobold.g:5163:1: ruleNumber returns [Boolean current=false] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final Boolean ruleNumber() throws RecognitionException {
        Boolean current = false;

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalKobold.g:5166:2: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // PsiInternalKobold.g:5167:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // PsiInternalKobold.g:5167:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_HEX) ) {
                alt92=1;
            }
            else if ( ((LA92_0>=RULE_INT && LA92_0<=RULE_DECIMAL)) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // PsiInternalKobold.g:5168:3: this_HEX_0= RULE_HEX
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getNumber_HEXTerminalRuleCall_0ElementType());
                      		
                    }
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_HEX_0);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:5176:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // PsiInternalKobold.g:5176:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // PsiInternalKobold.g:5177:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // PsiInternalKobold.g:5177:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_INT) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==RULE_DECIMAL) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // PsiInternalKobold.g:5178:5: this_INT_1= RULE_INT
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getNumber_INTTerminalRuleCall_1_0_0ElementType());
                              				
                            }
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(this_INT_1);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:5186:5: this_DECIMAL_2= RULE_DECIMAL
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getNumber_DECIMALTerminalRuleCall_1_0_1ElementType());
                              				
                            }
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(this_DECIMAL_2);
                              				
                            }

                            }
                            break;

                    }

                    // PsiInternalKobold.g:5194:4: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==46) ) {
                        int LA91_1 = input.LA(2);

                        if ( ((LA91_1>=RULE_INT && LA91_1<=RULE_DECIMAL)) ) {
                            alt91=1;
                        }
                    }
                    switch (alt91) {
                        case 1 :
                            // PsiInternalKobold.g:5195:5: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getNumber_FullStopKeyword_1_1_0ElementType());
                              				
                            }
                            kw=(Token)match(input,46,FOLLOW_73); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(kw);
                              				
                            }
                            // PsiInternalKobold.g:5202:5: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==RULE_INT) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==RULE_DECIMAL) ) {
                                alt90=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 90, 0, input);

                                throw nvae;
                            }
                            switch (alt90) {
                                case 1 :
                                    // PsiInternalKobold.g:5203:6: this_INT_4= RULE_INT
                                    {
                                    if ( state.backtracking==0 ) {

                                      						markLeaf(elementTypeProvider.getNumber_INTTerminalRuleCall_1_1_1_0ElementType());
                                      					
                                    }
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						doneLeaf(this_INT_4);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // PsiInternalKobold.g:5211:6: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    if ( state.backtracking==0 ) {

                                      						markLeaf(elementTypeProvider.getNumber_DECIMALTerminalRuleCall_1_1_1_1ElementType());
                                      					
                                    }
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						doneLeaf(this_DECIMAL_5);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // PsiInternalKobold.g:5228:1: entryRuleJvmTypeReference returns [Boolean current=false] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final Boolean entryRuleJvmTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmTypeReference = null;


        try {
            // PsiInternalKobold.g:5228:58: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // PsiInternalKobold.g:5229:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmTypeReferenceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // PsiInternalKobold.g:5235:1: ruleJvmTypeReference returns [Boolean current=false] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final Boolean ruleJvmTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean this_JvmParameterizedTypeReference_0 = null;

        Boolean this_XFunctionTypeRef_3 = null;


        try {
            // PsiInternalKobold.g:5236:1: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // PsiInternalKobold.g:5237:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // PsiInternalKobold.g:5237:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            else if ( (LA94_0==34||LA94_0==50) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // PsiInternalKobold.g:5238:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // PsiInternalKobold.g:5238:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // PsiInternalKobold.g:5239:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getJvmTypeReference_JvmParameterizedTypeReferenceParserRuleCall_0_0ElementType());
                      			
                    }
                    pushFollow(FOLLOW_66);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				doneComposite();
                      			
                    }
                    // PsiInternalKobold.g:5247:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==55) ) {
                            int LA93_2 = input.LA(2);

                            if ( (LA93_2==56) ) {
                                int LA93_3 = input.LA(3);

                                if ( (synpred43_PsiInternalKobold()) ) {
                                    alt93=1;
                                }


                            }


                        }


                        switch (alt93) {
                    	case 1 :
                    	    // PsiInternalKobold.g:5248:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // PsiInternalKobold.g:5254:5: ( () ruleArrayBrackets )
                    	    // PsiInternalKobold.g:5255:6: () ruleArrayBrackets
                    	    {
                    	    // PsiInternalKobold.g:5255:6: ()
                    	    // PsiInternalKobold.g:5256:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							precedeComposite(elementTypeProvider.getJvmTypeReference_JvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0ElementType());
                    	      							doneComposite();
                    	      							associateWithSemanticElement();
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getJvmTypeReference_ArrayBracketsParserRuleCall_0_1_0_1ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_66);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:5273:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getJvmTypeReference_XFunctionTypeRefParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // PsiInternalKobold.g:5285:1: entryRuleArrayBrackets returns [Boolean current=false] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final Boolean entryRuleArrayBrackets() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleArrayBrackets = null;


        try {
            // PsiInternalKobold.g:5285:55: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // PsiInternalKobold.g:5286:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getArrayBracketsElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // PsiInternalKobold.g:5292:1: ruleArrayBrackets returns [Boolean current=false] : (kw= '[' kw= ']' ) ;
    public final Boolean ruleArrayBrackets() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:5293:1: ( (kw= '[' kw= ']' ) )
            // PsiInternalKobold.g:5294:2: (kw= '[' kw= ']' )
            {
            // PsiInternalKobold.g:5294:2: (kw= '[' kw= ']' )
            // PsiInternalKobold.g:5295:3: kw= '[' kw= ']'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getArrayBrackets_LeftSquareBracketKeyword_0ElementType());
              		
            }
            kw=(Token)match(input,55,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getArrayBrackets_RightSquareBracketKeyword_1ElementType());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // PsiInternalKobold.g:5313:1: entryRuleXFunctionTypeRef returns [Boolean current=false] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final Boolean entryRuleXFunctionTypeRef() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXFunctionTypeRef = null;


        try {
            // PsiInternalKobold.g:5313:58: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // PsiInternalKobold.g:5314:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXFunctionTypeRefElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // PsiInternalKobold.g:5320:1: ruleXFunctionTypeRef returns [Boolean current=false] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final Boolean ruleXFunctionTypeRef() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Boolean lv_paramTypes_1_0 = null;

        Boolean lv_paramTypes_3_0 = null;

        Boolean lv_returnType_6_0 = null;


        try {
            // PsiInternalKobold.g:5321:1: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // PsiInternalKobold.g:5322:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // PsiInternalKobold.g:5322:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // PsiInternalKobold.g:5323:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // PsiInternalKobold.g:5323:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==50) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // PsiInternalKobold.g:5324:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXFunctionTypeRef_LeftParenthesisKeyword_0_0ElementType());
                      			
                    }
                    otherlv_0=(Token)match(input,50,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_0);
                      			
                    }
                    // PsiInternalKobold.g:5331:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==RULE_ID||LA96_0==34||LA96_0==50) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // PsiInternalKobold.g:5332:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // PsiInternalKobold.g:5332:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // PsiInternalKobold.g:5333:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // PsiInternalKobold.g:5333:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // PsiInternalKobold.g:5334:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getXFunctionTypeRef_ParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_33);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }

                            // PsiInternalKobold.g:5347:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( (LA95_0==49) ) {
                                    alt95=1;
                                }


                                switch (alt95) {
                            	case 1 :
                            	    // PsiInternalKobold.g:5348:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						markLeaf(elementTypeProvider.getXFunctionTypeRef_CommaKeyword_0_1_1_0ElementType());
                            	      					
                            	    }
                            	    otherlv_2=(Token)match(input,49,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						doneLeaf(otherlv_2);
                            	      					
                            	    }
                            	    // PsiInternalKobold.g:5355:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // PsiInternalKobold.g:5356:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // PsiInternalKobold.g:5356:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // PsiInternalKobold.g:5357:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								markComposite(elementTypeProvider.getXFunctionTypeRef_ParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0ElementType());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_33);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								doneComposite();
                            	      								if(!current) {
                            	      									associateWithSemanticElement();
                            	      									current = true;
                            	      								}
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop95;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXFunctionTypeRef_RightParenthesisKeyword_0_2ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,51,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXFunctionTypeRef_EqualsSignGreaterThanSignKeyword_1ElementType());
              		
            }
            otherlv_5=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
            }
            // PsiInternalKobold.g:5387:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:5388:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:5388:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:5389:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getXFunctionTypeRef_ReturnTypeJvmTypeReferenceParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // PsiInternalKobold.g:5406:1: entryRuleJvmParameterizedTypeReference returns [Boolean current=false] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final Boolean entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmParameterizedTypeReference = null;


        try {
            // PsiInternalKobold.g:5406:71: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // PsiInternalKobold.g:5407:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmParameterizedTypeReferenceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // PsiInternalKobold.g:5413:1: ruleJvmParameterizedTypeReference returns [Boolean current=false] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final Boolean ruleJvmParameterizedTypeReference() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Boolean lv_arguments_2_0 = null;

        Boolean lv_arguments_4_0 = null;

        Boolean lv_arguments_10_0 = null;

        Boolean lv_arguments_12_0 = null;


        try {
            // PsiInternalKobold.g:5414:1: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // PsiInternalKobold.g:5415:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // PsiInternalKobold.g:5415:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // PsiInternalKobold.g:5416:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // PsiInternalKobold.g:5416:3: ( ( ruleQualifiedName ) )
            // PsiInternalKobold.g:5417:4: ( ruleQualifiedName )
            {
            // PsiInternalKobold.g:5417:4: ( ruleQualifiedName )
            // PsiInternalKobold.g:5418:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmParameterizedTypeReference_TypeJvmTypeCrossReference_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_76);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalKobold.g:5433:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt102=2;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // PsiInternalKobold.g:5434:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // PsiInternalKobold.g:5434:4: ( ( '<' )=>otherlv_1= '<' )
                    // PsiInternalKobold.g:5435:5: ( '<' )=>otherlv_1= '<'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_LessThanSignKeyword_1_0ElementType());
                      				
                    }
                    otherlv_1=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_1);
                      				
                    }

                    }

                    // PsiInternalKobold.g:5444:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // PsiInternalKobold.g:5445:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // PsiInternalKobold.g:5445:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // PsiInternalKobold.g:5446:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getJvmParameterizedTypeReference_ArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalKobold.g:5459:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==49) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // PsiInternalKobold.g:5460:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_CommaKeyword_1_2_0ElementType());
                    	      				
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_3);
                    	      				
                    	    }
                    	    // PsiInternalKobold.g:5467:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // PsiInternalKobold.g:5468:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // PsiInternalKobold.g:5468:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // PsiInternalKobold.g:5469:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getJvmParameterizedTypeReference_ArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_GreaterThanSignKeyword_1_3ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,22,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalKobold.g:5490:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==46) ) {
                            int LA101_2 = input.LA(2);

                            if ( (LA101_2==RULE_ID) ) {
                                int LA101_3 = input.LA(3);

                                if ( (synpred45_PsiInternalKobold()) ) {
                                    alt101=1;
                                }


                            }


                        }


                        switch (alt101) {
                    	case 1 :
                    	    // PsiInternalKobold.g:5491:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // PsiInternalKobold.g:5491:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // PsiInternalKobold.g:5492:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // PsiInternalKobold.g:5498:6: ( () otherlv_7= '.' )
                    	    // PsiInternalKobold.g:5499:7: () otherlv_7= '.'
                    	    {
                    	    // PsiInternalKobold.g:5499:7: ()
                    	    // PsiInternalKobold.g:5500:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								precedeComposite(elementTypeProvider.getJvmParameterizedTypeReference_JvmInnerTypeReferenceOuterAction_1_4_0_0_0ElementType());
                    	      								doneComposite();
                    	      								associateWithSemanticElement();
                    	      							
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      							markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_FullStopKeyword_1_4_0_0_1ElementType());
                    	      						
                    	    }
                    	    otherlv_7=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneLeaf(otherlv_7);
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // PsiInternalKobold.g:5515:5: ( ( ruleValidID ) )
                    	    // PsiInternalKobold.g:5516:6: ( ruleValidID )
                    	    {
                    	    // PsiInternalKobold.g:5516:6: ( ruleValidID )
                    	    // PsiInternalKobold.g:5517:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getJvmParameterizedTypeReference_TypeJvmTypeCrossReference_1_4_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_77);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // PsiInternalKobold.g:5532:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt100=2;
                    	    alt100 = dfa100.predict(input);
                    	    switch (alt100) {
                    	        case 1 :
                    	            // PsiInternalKobold.g:5533:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // PsiInternalKobold.g:5533:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // PsiInternalKobold.g:5534:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_LessThanSignKeyword_1_4_2_0ElementType());
                    	              						
                    	            }
                    	            otherlv_9=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							doneLeaf(otherlv_9);
                    	              						
                    	            }

                    	            }

                    	            // PsiInternalKobold.g:5543:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // PsiInternalKobold.g:5544:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // PsiInternalKobold.g:5544:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // PsiInternalKobold.g:5545:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								markComposite(elementTypeProvider.getJvmParameterizedTypeReference_ArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0ElementType());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_29);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								doneComposite();
                    	              								if(!current) {
                    	              									associateWithSemanticElement();
                    	              									current = true;
                    	              								}
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // PsiInternalKobold.g:5558:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop99:
                    	            do {
                    	                int alt99=2;
                    	                int LA99_0 = input.LA(1);

                    	                if ( (LA99_0==49) ) {
                    	                    alt99=1;
                    	                }


                    	                switch (alt99) {
                    	            	case 1 :
                    	            	    // PsiInternalKobold.g:5559:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_CommaKeyword_1_4_2_2_0ElementType());
                    	            	      						
                    	            	    }
                    	            	    otherlv_11=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							doneLeaf(otherlv_11);
                    	            	      						
                    	            	    }
                    	            	    // PsiInternalKobold.g:5566:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // PsiInternalKobold.g:5567:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // PsiInternalKobold.g:5567:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // PsiInternalKobold.g:5568:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									markComposite(elementTypeProvider.getJvmParameterizedTypeReference_ArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0ElementType());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_29);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									doneComposite();
                    	            	      									if(!current) {
                    	            	      										associateWithSemanticElement();
                    	            	      										current = true;
                    	            	      									}
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop99;
                    	                }
                    	            } while (true);

                    	            if ( state.backtracking==0 ) {

                    	              						markLeaf(elementTypeProvider.getJvmParameterizedTypeReference_GreaterThanSignKeyword_1_4_2_3ElementType());
                    	              					
                    	            }
                    	            otherlv_13=(Token)match(input,22,FOLLOW_72); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						doneLeaf(otherlv_13);
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // PsiInternalKobold.g:5596:1: entryRuleJvmArgumentTypeReference returns [Boolean current=false] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final Boolean entryRuleJvmArgumentTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmArgumentTypeReference = null;


        try {
            // PsiInternalKobold.g:5596:66: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // PsiInternalKobold.g:5597:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmArgumentTypeReferenceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // PsiInternalKobold.g:5603:1: ruleJvmArgumentTypeReference returns [Boolean current=false] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final Boolean ruleJvmArgumentTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean this_JvmTypeReference_0 = null;

        Boolean this_JvmWildcardTypeReference_1 = null;


        try {
            // PsiInternalKobold.g:5604:1: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // PsiInternalKobold.g:5605:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // PsiInternalKobold.g:5605:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_ID||LA103_0==34||LA103_0==50) ) {
                alt103=1;
            }
            else if ( (LA103_0==86) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // PsiInternalKobold.g:5606:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getJvmArgumentTypeReference_JvmTypeReferenceParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:5615:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getJvmArgumentTypeReference_JvmWildcardTypeReferenceParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // PsiInternalKobold.g:5627:1: entryRuleJvmWildcardTypeReference returns [Boolean current=false] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final Boolean entryRuleJvmWildcardTypeReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmWildcardTypeReference = null;


        try {
            // PsiInternalKobold.g:5627:66: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // PsiInternalKobold.g:5628:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmWildcardTypeReferenceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // PsiInternalKobold.g:5634:1: ruleJvmWildcardTypeReference returns [Boolean current=false] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final Boolean ruleJvmWildcardTypeReference() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Boolean lv_constraints_2_0 = null;

        Boolean lv_constraints_3_0 = null;

        Boolean lv_constraints_4_0 = null;

        Boolean lv_constraints_5_0 = null;


        try {
            // PsiInternalKobold.g:5635:1: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // PsiInternalKobold.g:5636:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // PsiInternalKobold.g:5636:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // PsiInternalKobold.g:5637:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // PsiInternalKobold.g:5637:3: ()
            // PsiInternalKobold.g:5638:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getJvmWildcardTypeReference_JvmWildcardTypeReferenceAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getJvmWildcardTypeReference_QuestionMarkKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,86,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalKobold.g:5651:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==70) ) {
                alt106=1;
            }
            else if ( (LA106_0==74) ) {
                alt106=2;
            }
            switch (alt106) {
                case 1 :
                    // PsiInternalKobold.g:5652:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // PsiInternalKobold.g:5652:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // PsiInternalKobold.g:5653:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // PsiInternalKobold.g:5653:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // PsiInternalKobold.g:5654:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // PsiInternalKobold.g:5654:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // PsiInternalKobold.g:5655:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getJvmWildcardTypeReference_ConstraintsJvmUpperBoundParserRuleCall_2_0_0_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_79);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    // PsiInternalKobold.g:5668:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==87) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // PsiInternalKobold.g:5669:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // PsiInternalKobold.g:5669:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // PsiInternalKobold.g:5670:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getJvmWildcardTypeReference_ConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_79);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:5685:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // PsiInternalKobold.g:5685:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // PsiInternalKobold.g:5686:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // PsiInternalKobold.g:5686:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // PsiInternalKobold.g:5687:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // PsiInternalKobold.g:5687:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // PsiInternalKobold.g:5688:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getJvmWildcardTypeReference_ConstraintsJvmLowerBoundParserRuleCall_2_1_0_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_79);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    // PsiInternalKobold.g:5701:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==87) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // PsiInternalKobold.g:5702:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // PsiInternalKobold.g:5702:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // PsiInternalKobold.g:5703:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getJvmWildcardTypeReference_ConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_79);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // PsiInternalKobold.g:5722:1: entryRuleJvmUpperBound returns [Boolean current=false] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final Boolean entryRuleJvmUpperBound() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmUpperBound = null;


        try {
            // PsiInternalKobold.g:5722:55: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // PsiInternalKobold.g:5723:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmUpperBoundElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // PsiInternalKobold.g:5729:1: ruleJvmUpperBound returns [Boolean current=false] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final Boolean ruleJvmUpperBound() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_typeReference_1_0 = null;


        try {
            // PsiInternalKobold.g:5730:1: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // PsiInternalKobold.g:5731:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // PsiInternalKobold.g:5731:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // PsiInternalKobold.g:5732:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getJvmUpperBound_ExtendsKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,70,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:5739:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:5740:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:5740:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:5741:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmUpperBound_TypeReferenceJvmTypeReferenceParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // PsiInternalKobold.g:5758:1: entryRuleJvmUpperBoundAnded returns [Boolean current=false] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final Boolean entryRuleJvmUpperBoundAnded() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmUpperBoundAnded = null;


        try {
            // PsiInternalKobold.g:5758:60: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // PsiInternalKobold.g:5759:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmUpperBoundAndedElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // PsiInternalKobold.g:5765:1: ruleJvmUpperBoundAnded returns [Boolean current=false] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final Boolean ruleJvmUpperBoundAnded() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_typeReference_1_0 = null;


        try {
            // PsiInternalKobold.g:5766:1: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // PsiInternalKobold.g:5767:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // PsiInternalKobold.g:5767:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // PsiInternalKobold.g:5768:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getJvmUpperBoundAnded_AmpersandKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,87,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:5775:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:5776:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:5776:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:5777:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmUpperBoundAnded_TypeReferenceJvmTypeReferenceParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // PsiInternalKobold.g:5794:1: entryRuleJvmLowerBound returns [Boolean current=false] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final Boolean entryRuleJvmLowerBound() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmLowerBound = null;


        try {
            // PsiInternalKobold.g:5794:55: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // PsiInternalKobold.g:5795:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmLowerBoundElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // PsiInternalKobold.g:5801:1: ruleJvmLowerBound returns [Boolean current=false] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final Boolean ruleJvmLowerBound() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_typeReference_1_0 = null;


        try {
            // PsiInternalKobold.g:5802:1: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // PsiInternalKobold.g:5803:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // PsiInternalKobold.g:5803:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // PsiInternalKobold.g:5804:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getJvmLowerBound_SuperKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,74,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:5811:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:5812:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:5812:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:5813:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmLowerBound_TypeReferenceJvmTypeReferenceParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // PsiInternalKobold.g:5830:1: entryRuleJvmLowerBoundAnded returns [Boolean current=false] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final Boolean entryRuleJvmLowerBoundAnded() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJvmLowerBoundAnded = null;


        try {
            // PsiInternalKobold.g:5830:60: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // PsiInternalKobold.g:5831:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getJvmLowerBoundAndedElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // PsiInternalKobold.g:5837:1: ruleJvmLowerBoundAnded returns [Boolean current=false] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final Boolean ruleJvmLowerBoundAnded() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_typeReference_1_0 = null;


        try {
            // PsiInternalKobold.g:5838:1: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // PsiInternalKobold.g:5839:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // PsiInternalKobold.g:5839:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // PsiInternalKobold.g:5840:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getJvmLowerBoundAnded_AmpersandKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,87,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:5847:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // PsiInternalKobold.g:5848:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // PsiInternalKobold.g:5848:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // PsiInternalKobold.g:5849:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getJvmLowerBoundAnded_TypeReferenceJvmTypeReferenceParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // PsiInternalKobold.g:5866:1: entryRuleQualifiedNameWithWildcard returns [Boolean current=false] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final Boolean entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNameWithWildcard = null;


        try {
            // PsiInternalKobold.g:5866:67: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // PsiInternalKobold.g:5867:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameWithWildcardElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // PsiInternalKobold.g:5873:1: ruleQualifiedNameWithWildcard returns [Boolean current=false] : ( ruleQualifiedName kw= '.' kw= '*' ) ;
    public final Boolean ruleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:5874:1: ( ( ruleQualifiedName kw= '.' kw= '*' ) )
            // PsiInternalKobold.g:5875:2: ( ruleQualifiedName kw= '.' kw= '*' )
            {
            // PsiInternalKobold.g:5875:2: ( ruleQualifiedName kw= '.' kw= '*' )
            // PsiInternalKobold.g:5876:3: ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getQualifiedNameWithWildcard_QualifiedNameParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_80);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getQualifiedNameWithWildcard_FullStopKeyword_1ElementType());
              		
            }
            kw=(Token)match(input,46,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getQualifiedNameWithWildcard_AsteriskKeyword_2ElementType());
              		
            }
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // PsiInternalKobold.g:5901:1: entryRuleValidID returns [Boolean current=false] : iv_ruleValidID= ruleValidID EOF ;
    public final Boolean entryRuleValidID() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidID = null;


        try {
            // PsiInternalKobold.g:5901:49: (iv_ruleValidID= ruleValidID EOF )
            // PsiInternalKobold.g:5902:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getValidIDElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // PsiInternalKobold.g:5908:1: ruleValidID returns [Boolean current=false] : this_ID_0= RULE_ID ;
    public final Boolean ruleValidID() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;

        try {
            // PsiInternalKobold.g:5909:1: (this_ID_0= RULE_ID )
            // PsiInternalKobold.g:5910:2: this_ID_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              		markLeaf(elementTypeProvider.getValidID_IDTerminalRuleCallElementType());
              	
            }
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneLeaf(this_ID_0);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // PsiInternalKobold.g:5920:1: entryRuleXImportDeclaration returns [Boolean current=false] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final Boolean entryRuleXImportDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleXImportDeclaration = null;


        try {
            // PsiInternalKobold.g:5920:60: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // PsiInternalKobold.g:5921:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXImportDeclarationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // PsiInternalKobold.g:5927:1: ruleXImportDeclaration returns [Boolean current=false] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final Boolean ruleXImportDeclaration() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        Boolean lv_memberName_5_0 = null;

        Boolean lv_importedNamespace_7_0 = null;


        try {
            // PsiInternalKobold.g:5928:1: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // PsiInternalKobold.g:5929:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // PsiInternalKobold.g:5929:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // PsiInternalKobold.g:5930:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getXImportDeclaration_ImportKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,72,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalKobold.g:5937:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt109=3;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // PsiInternalKobold.g:5938:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // PsiInternalKobold.g:5938:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // PsiInternalKobold.g:5939:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // PsiInternalKobold.g:5939:5: ( (lv_static_1_0= 'static' ) )
                    // PsiInternalKobold.g:5940:6: (lv_static_1_0= 'static' )
                    {
                    // PsiInternalKobold.g:5940:6: (lv_static_1_0= 'static' )
                    // PsiInternalKobold.g:5941:7: lv_static_1_0= 'static'
                    {
                    if ( state.backtracking==0 ) {

                      							markLeaf(elementTypeProvider.getXImportDeclaration_StaticStaticKeyword_1_0_0_0ElementType());
                      						
                    }
                    lv_static_1_0=(Token)match(input,71,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneLeaf(lv_static_1_0);
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    // PsiInternalKobold.g:5956:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==73) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // PsiInternalKobold.g:5957:6: (lv_extension_2_0= 'extension' )
                            {
                            // PsiInternalKobold.g:5957:6: (lv_extension_2_0= 'extension' )
                            // PsiInternalKobold.g:5958:7: lv_extension_2_0= 'extension'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getXImportDeclaration_ExtensionExtensionKeyword_1_0_1_0ElementType());
                              						
                            }
                            lv_extension_2_0=(Token)match(input,73,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_extension_2_0);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }
                            break;

                    }

                    // PsiInternalKobold.g:5973:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // PsiInternalKobold.g:5974:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // PsiInternalKobold.g:5974:6: ( ruleQualifiedNameInStaticImport )
                    // PsiInternalKobold.g:5975:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getXImportDeclaration_ImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_84);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      						
                    }

                    }


                    }

                    // PsiInternalKobold.g:5990:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==39) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==RULE_ID) ) {
                        alt108=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // PsiInternalKobold.g:5991:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // PsiInternalKobold.g:5991:6: ( (lv_wildcard_4_0= '*' ) )
                            // PsiInternalKobold.g:5992:7: (lv_wildcard_4_0= '*' )
                            {
                            // PsiInternalKobold.g:5992:7: (lv_wildcard_4_0= '*' )
                            // PsiInternalKobold.g:5993:8: lv_wildcard_4_0= '*'
                            {
                            if ( state.backtracking==0 ) {

                              								markLeaf(elementTypeProvider.getXImportDeclaration_WildcardAsteriskKeyword_1_0_3_0_0ElementType());
                              							
                            }
                            lv_wildcard_4_0=(Token)match(input,39,FOLLOW_85); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneLeaf(lv_wildcard_4_0);
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalKobold.g:6009:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // PsiInternalKobold.g:6009:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // PsiInternalKobold.g:6010:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // PsiInternalKobold.g:6010:7: (lv_memberName_5_0= ruleValidID )
                            // PsiInternalKobold.g:6011:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getXImportDeclaration_MemberNameValidIDParserRuleCall_1_0_3_1_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_85);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalKobold.g:6027:4: ( ( ruleQualifiedName ) )
                    {
                    // PsiInternalKobold.g:6027:4: ( ( ruleQualifiedName ) )
                    // PsiInternalKobold.g:6028:5: ( ruleQualifiedName )
                    {
                    // PsiInternalKobold.g:6028:5: ( ruleQualifiedName )
                    // PsiInternalKobold.g:6029:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXImportDeclaration_ImportedTypeJvmDeclaredTypeCrossReference_1_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_85);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalKobold.g:6045:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // PsiInternalKobold.g:6045:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // PsiInternalKobold.g:6046:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // PsiInternalKobold.g:6046:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // PsiInternalKobold.g:6047:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getXImportDeclaration_ImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_85);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalKobold.g:6061:3: (otherlv_8= ';' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==58) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // PsiInternalKobold.g:6062:4: otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getXImportDeclaration_SemicolonKeyword_2ElementType());
                      			
                    }
                    otherlv_8=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_8);
                      			
                    }

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // PsiInternalKobold.g:6074:1: entryRuleQualifiedNameInStaticImport returns [Boolean current=false] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final Boolean entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNameInStaticImport = null;


        try {
            // PsiInternalKobold.g:6074:69: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // PsiInternalKobold.g:6075:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameInStaticImportElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // PsiInternalKobold.g:6081:1: ruleQualifiedNameInStaticImport returns [Boolean current=false] : ( ruleValidID kw= '.' )+ ;
    public final Boolean ruleQualifiedNameInStaticImport() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalKobold.g:6082:1: ( ( ruleValidID kw= '.' )+ )
            // PsiInternalKobold.g:6083:2: ( ruleValidID kw= '.' )+
            {
            // PsiInternalKobold.g:6083:2: ( ruleValidID kw= '.' )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==RULE_ID) ) {
                    int LA111_2 = input.LA(2);

                    if ( (LA111_2==46) ) {
                        alt111=1;
                    }


                }


                switch (alt111) {
            	case 1 :
            	    // PsiInternalKobold.g:6084:3: ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			markComposite(elementTypeProvider.getQualifiedNameInStaticImport_ValidIDParserRuleCall_0ElementType());
            	      		
            	    }
            	    pushFollow(FOLLOW_80);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			doneComposite();
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			markLeaf(elementTypeProvider.getQualifiedNameInStaticImport_FullStopKeyword_1ElementType());
            	      		
            	    }
            	    kw=(Token)match(input,46,FOLLOW_86); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			doneLeaf(kw);
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt111 >= 1 ) break loop111;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_PsiInternalKobold
    public final void synpred1_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:214:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // PsiInternalKobold.g:214:7: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // PsiInternalKobold.g:214:7: ( () ( ( ruleOpMultiAssign ) ) )
        // PsiInternalKobold.g:215:7: () ( ( ruleOpMultiAssign ) )
        {
        // PsiInternalKobold.g:215:7: ()
        // PsiInternalKobold.g:216:7: 
        {
        }

        // PsiInternalKobold.g:217:7: ( ( ruleOpMultiAssign ) )
        // PsiInternalKobold.g:218:8: ( ruleOpMultiAssign )
        {
        // PsiInternalKobold.g:218:8: ( ruleOpMultiAssign )
        // PsiInternalKobold.g:219:9: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_2);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_PsiInternalKobold

    // $ANTLR start synpred2_PsiInternalKobold
    public final void synpred2_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:414:5: ( ( () ( ( ruleOpOr ) ) ) )
        // PsiInternalKobold.g:414:6: ( () ( ( ruleOpOr ) ) )
        {
        // PsiInternalKobold.g:414:6: ( () ( ( ruleOpOr ) ) )
        // PsiInternalKobold.g:415:6: () ( ( ruleOpOr ) )
        {
        // PsiInternalKobold.g:415:6: ()
        // PsiInternalKobold.g:416:6: 
        {
        }

        // PsiInternalKobold.g:417:6: ( ( ruleOpOr ) )
        // PsiInternalKobold.g:418:7: ( ruleOpOr )
        {
        // PsiInternalKobold.g:418:7: ( ruleOpOr )
        // PsiInternalKobold.g:419:8: ruleOpOr
        {
        pushFollow(FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_PsiInternalKobold

    // $ANTLR start synpred3_PsiInternalKobold
    public final void synpred3_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:510:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // PsiInternalKobold.g:510:6: ( () ( ( ruleOpAnd ) ) )
        {
        // PsiInternalKobold.g:510:6: ( () ( ( ruleOpAnd ) ) )
        // PsiInternalKobold.g:511:6: () ( ( ruleOpAnd ) )
        {
        // PsiInternalKobold.g:511:6: ()
        // PsiInternalKobold.g:512:6: 
        {
        }

        // PsiInternalKobold.g:513:6: ( ( ruleOpAnd ) )
        // PsiInternalKobold.g:514:7: ( ruleOpAnd )
        {
        // PsiInternalKobold.g:514:7: ( ruleOpAnd )
        // PsiInternalKobold.g:515:8: ruleOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_PsiInternalKobold

    // $ANTLR start synpred4_PsiInternalKobold
    public final void synpred4_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:606:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // PsiInternalKobold.g:606:6: ( () ( ( ruleOpEquality ) ) )
        {
        // PsiInternalKobold.g:606:6: ( () ( ( ruleOpEquality ) ) )
        // PsiInternalKobold.g:607:6: () ( ( ruleOpEquality ) )
        {
        // PsiInternalKobold.g:607:6: ()
        // PsiInternalKobold.g:608:6: 
        {
        }

        // PsiInternalKobold.g:609:6: ( ( ruleOpEquality ) )
        // PsiInternalKobold.g:610:7: ( ruleOpEquality )
        {
        // PsiInternalKobold.g:610:7: ( ruleOpEquality )
        // PsiInternalKobold.g:611:8: ruleOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_PsiInternalKobold

    // $ANTLR start synpred5_PsiInternalKobold
    public final void synpred5_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:729:6: ( ( () 'instanceof' ) )
        // PsiInternalKobold.g:729:7: ( () 'instanceof' )
        {
        // PsiInternalKobold.g:729:7: ( () 'instanceof' )
        // PsiInternalKobold.g:730:7: () 'instanceof'
        {
        // PsiInternalKobold.g:730:7: ()
        // PsiInternalKobold.g:731:7: 
        {
        }

        match(input,30,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_PsiInternalKobold

    // $ANTLR start synpred6_PsiInternalKobold
    public final void synpred6_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:771:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // PsiInternalKobold.g:771:7: ( () ( ( ruleOpCompare ) ) )
        {
        // PsiInternalKobold.g:771:7: ( () ( ( ruleOpCompare ) ) )
        // PsiInternalKobold.g:772:7: () ( ( ruleOpCompare ) )
        {
        // PsiInternalKobold.g:772:7: ()
        // PsiInternalKobold.g:773:7: 
        {
        }

        // PsiInternalKobold.g:774:7: ( ( ruleOpCompare ) )
        // PsiInternalKobold.g:775:8: ( ruleOpCompare )
        {
        // PsiInternalKobold.g:775:8: ( ruleOpCompare )
        // PsiInternalKobold.g:776:9: ruleOpCompare
        {
        pushFollow(FOLLOW_2);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_PsiInternalKobold

    // $ANTLR start synpred7_PsiInternalKobold
    public final void synpred7_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:903:5: ( ( () ( ( ruleOpOther ) ) ) )
        // PsiInternalKobold.g:903:6: ( () ( ( ruleOpOther ) ) )
        {
        // PsiInternalKobold.g:903:6: ( () ( ( ruleOpOther ) ) )
        // PsiInternalKobold.g:904:6: () ( ( ruleOpOther ) )
        {
        // PsiInternalKobold.g:904:6: ()
        // PsiInternalKobold.g:905:6: 
        {
        }

        // PsiInternalKobold.g:906:6: ( ( ruleOpOther ) )
        // PsiInternalKobold.g:907:7: ( ruleOpOther )
        {
        // PsiInternalKobold.g:907:7: ( ruleOpOther )
        // PsiInternalKobold.g:908:8: ruleOpOther
        {
        pushFollow(FOLLOW_2);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_PsiInternalKobold

    // $ANTLR start synpred8_PsiInternalKobold
    public final void synpred8_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1029:6: ( ( '>' '>' ) )
        // PsiInternalKobold.g:1029:7: ( '>' '>' )
        {
        // PsiInternalKobold.g:1029:7: ( '>' '>' )
        // PsiInternalKobold.g:1030:7: '>' '>'
        {
        match(input,22,FOLLOW_19); if (state.failed) return ;
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_PsiInternalKobold

    // $ANTLR start synpred9_PsiInternalKobold
    public final void synpred9_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1072:6: ( ( '<' '<' ) )
        // PsiInternalKobold.g:1072:7: ( '<' '<' )
        {
        // PsiInternalKobold.g:1072:7: ( '<' '<' )
        // PsiInternalKobold.g:1073:7: '<' '<'
        {
        match(input,21,FOLLOW_9); if (state.failed) return ;
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_PsiInternalKobold

    // $ANTLR start synpred10_PsiInternalKobold
    public final void synpred10_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1152:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // PsiInternalKobold.g:1152:6: ( () ( ( ruleOpAdd ) ) )
        {
        // PsiInternalKobold.g:1152:6: ( () ( ( ruleOpAdd ) ) )
        // PsiInternalKobold.g:1153:6: () ( ( ruleOpAdd ) )
        {
        // PsiInternalKobold.g:1153:6: ()
        // PsiInternalKobold.g:1154:6: 
        {
        }

        // PsiInternalKobold.g:1155:6: ( ( ruleOpAdd ) )
        // PsiInternalKobold.g:1156:7: ( ruleOpAdd )
        {
        // PsiInternalKobold.g:1156:7: ( ruleOpAdd )
        // PsiInternalKobold.g:1157:8: ruleOpAdd
        {
        pushFollow(FOLLOW_2);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_PsiInternalKobold

    // $ANTLR start synpred11_PsiInternalKobold
    public final void synpred11_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1258:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // PsiInternalKobold.g:1258:6: ( () ( ( ruleOpMulti ) ) )
        {
        // PsiInternalKobold.g:1258:6: ( () ( ( ruleOpMulti ) ) )
        // PsiInternalKobold.g:1259:6: () ( ( ruleOpMulti ) )
        {
        // PsiInternalKobold.g:1259:6: ()
        // PsiInternalKobold.g:1260:6: 
        {
        }

        // PsiInternalKobold.g:1261:6: ( ( ruleOpMulti ) )
        // PsiInternalKobold.g:1262:7: ( ruleOpMulti )
        {
        // PsiInternalKobold.g:1262:7: ( ruleOpMulti )
        // PsiInternalKobold.g:1263:8: ruleOpMulti
        {
        pushFollow(FOLLOW_2);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_PsiInternalKobold

    // $ANTLR start synpred12_PsiInternalKobold
    public final void synpred12_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1481:5: ( ( () 'as' ) )
        // PsiInternalKobold.g:1481:6: ( () 'as' )
        {
        // PsiInternalKobold.g:1481:6: ( () 'as' )
        // PsiInternalKobold.g:1482:6: () 'as'
        {
        // PsiInternalKobold.g:1482:6: ()
        // PsiInternalKobold.g:1483:6: 
        {
        }

        match(input,43,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_PsiInternalKobold

    // $ANTLR start synpred13_PsiInternalKobold
    public final void synpred13_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1543:4: ( ( () ( ( ruleOpPostfix ) ) ) )
        // PsiInternalKobold.g:1543:5: ( () ( ( ruleOpPostfix ) ) )
        {
        // PsiInternalKobold.g:1543:5: ( () ( ( ruleOpPostfix ) ) )
        // PsiInternalKobold.g:1544:5: () ( ( ruleOpPostfix ) )
        {
        // PsiInternalKobold.g:1544:5: ()
        // PsiInternalKobold.g:1545:5: 
        {
        }

        // PsiInternalKobold.g:1546:5: ( ( ruleOpPostfix ) )
        // PsiInternalKobold.g:1547:6: ( ruleOpPostfix )
        {
        // PsiInternalKobold.g:1547:6: ( ruleOpPostfix )
        // PsiInternalKobold.g:1548:7: ruleOpPostfix
        {
        pushFollow(FOLLOW_2);
        ruleOpPostfix();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_PsiInternalKobold

    // $ANTLR start synpred14_PsiInternalKobold
    public final void synpred14_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1634:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // PsiInternalKobold.g:1634:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // PsiInternalKobold.g:1634:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // PsiInternalKobold.g:1635:7: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // PsiInternalKobold.g:1635:7: ()
        // PsiInternalKobold.g:1636:7: 
        {
        }

        // PsiInternalKobold.g:1637:7: ( '.' | ( ( '::' ) ) )
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( (LA112_0==46) ) {
            alt112=1;
        }
        else if ( (LA112_0==47) ) {
            alt112=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 112, 0, input);

            throw nvae;
        }
        switch (alt112) {
            case 1 :
                // PsiInternalKobold.g:1638:8: '.'
                {
                match(input,46,FOLLOW_26); if (state.failed) return ;

                }
                break;
            case 2 :
                // PsiInternalKobold.g:1640:8: ( ( '::' ) )
                {
                // PsiInternalKobold.g:1640:8: ( ( '::' ) )
                // PsiInternalKobold.g:1641:9: ( '::' )
                {
                // PsiInternalKobold.g:1641:9: ( '::' )
                // PsiInternalKobold.g:1642:10: '::'
                {
                match(input,47,FOLLOW_26); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // PsiInternalKobold.g:1646:7: ( ( ruleFeatureCallID ) )
        // PsiInternalKobold.g:1647:8: ( ruleFeatureCallID )
        {
        // PsiInternalKobold.g:1647:8: ( ruleFeatureCallID )
        // PsiInternalKobold.g:1648:9: ruleFeatureCallID
        {
        pushFollow(FOLLOW_6);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_PsiInternalKobold

    // $ANTLR start synpred15_PsiInternalKobold
    public final void synpred15_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1734:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // PsiInternalKobold.g:1734:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // PsiInternalKobold.g:1734:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // PsiInternalKobold.g:1735:7: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // PsiInternalKobold.g:1735:7: ()
        // PsiInternalKobold.g:1736:7: 
        {
        }

        // PsiInternalKobold.g:1737:7: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt113=3;
        switch ( input.LA(1) ) {
        case 46:
            {
            alt113=1;
            }
            break;
        case 48:
            {
            alt113=2;
            }
            break;
        case 47:
            {
            alt113=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 113, 0, input);

            throw nvae;
        }

        switch (alt113) {
            case 1 :
                // PsiInternalKobold.g:1738:8: '.'
                {
                match(input,46,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // PsiInternalKobold.g:1740:8: ( ( '?.' ) )
                {
                // PsiInternalKobold.g:1740:8: ( ( '?.' ) )
                // PsiInternalKobold.g:1741:9: ( '?.' )
                {
                // PsiInternalKobold.g:1741:9: ( '?.' )
                // PsiInternalKobold.g:1742:10: '?.'
                {
                match(input,48,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // PsiInternalKobold.g:1746:8: ( ( '::' ) )
                {
                // PsiInternalKobold.g:1746:8: ( ( '::' ) )
                // PsiInternalKobold.g:1747:9: ( '::' )
                {
                // PsiInternalKobold.g:1747:9: ( '::' )
                // PsiInternalKobold.g:1748:10: '::'
                {
                match(input,47,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred15_PsiInternalKobold

    // $ANTLR start synpred16_PsiInternalKobold
    public final void synpred16_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1883:7: ( ( '(' ) )
        // PsiInternalKobold.g:1883:8: ( '(' )
        {
        // PsiInternalKobold.g:1883:8: ( '(' )
        // PsiInternalKobold.g:1884:8: '('
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_PsiInternalKobold

    // $ANTLR start synpred17_PsiInternalKobold
    public final void synpred17_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1905:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // PsiInternalKobold.g:1905:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // PsiInternalKobold.g:1905:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // PsiInternalKobold.g:1906:9: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // PsiInternalKobold.g:1906:9: ()
        // PsiInternalKobold.g:1907:9: 
        {
        }

        // PsiInternalKobold.g:1908:9: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt115=2;
        int LA115_0 = input.LA(1);

        if ( (LA115_0==RULE_ID||LA115_0==34||LA115_0==50) ) {
            alt115=1;
        }
        switch (alt115) {
            case 1 :
                // PsiInternalKobold.g:1909:10: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // PsiInternalKobold.g:1909:10: ( ( ruleJvmFormalParameter ) )
                // PsiInternalKobold.g:1910:11: ( ruleJvmFormalParameter )
                {
                // PsiInternalKobold.g:1910:11: ( ruleJvmFormalParameter )
                // PsiInternalKobold.g:1911:12: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_42);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // PsiInternalKobold.g:1914:10: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop114:
                do {
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==49) ) {
                        alt114=1;
                    }


                    switch (alt114) {
                	case 1 :
                	    // PsiInternalKobold.g:1915:11: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_16); if (state.failed) return ;
                	    // PsiInternalKobold.g:1916:11: ( ( ruleJvmFormalParameter ) )
                	    // PsiInternalKobold.g:1917:12: ( ruleJvmFormalParameter )
                	    {
                	    // PsiInternalKobold.g:1917:12: ( ruleJvmFormalParameter )
                	    // PsiInternalKobold.g:1918:13: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_42);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop114;
                    }
                } while (true);


                }
                break;

        }

        // PsiInternalKobold.g:1923:9: ( ( '|' ) )
        // PsiInternalKobold.g:1924:10: ( '|' )
        {
        // PsiInternalKobold.g:1924:10: ( '|' )
        // PsiInternalKobold.g:1925:11: '|'
        {
        match(input,57,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_PsiInternalKobold

    // $ANTLR start synpred18_PsiInternalKobold
    public final void synpred18_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:1996:6: ( ( () '[' ) )
        // PsiInternalKobold.g:1996:7: ( () '[' )
        {
        // PsiInternalKobold.g:1996:7: ( () '[' )
        // PsiInternalKobold.g:1997:7: () '['
        {
        // PsiInternalKobold.g:1997:7: ()
        // PsiInternalKobold.g:1998:7: 
        {
        }

        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_PsiInternalKobold

    // $ANTLR start synpred19_PsiInternalKobold
    public final void synpred19_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2060:4: ( ( () 'synchronized' '(' ) )
        // PsiInternalKobold.g:2060:5: ( () 'synchronized' '(' )
        {
        // PsiInternalKobold.g:2060:5: ( () 'synchronized' '(' )
        // PsiInternalKobold.g:2061:5: () 'synchronized' '('
        {
        // PsiInternalKobold.g:2061:5: ()
        // PsiInternalKobold.g:2062:5: 
        {
        }

        match(input,84,FOLLOW_47); if (state.failed) return ;
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_PsiInternalKobold

    // $ANTLR start synpred20_PsiInternalKobold
    public final void synpred20_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2105:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // PsiInternalKobold.g:2105:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // PsiInternalKobold.g:2105:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // PsiInternalKobold.g:2106:5: () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        // PsiInternalKobold.g:2106:5: ()
        // PsiInternalKobold.g:2107:5: 
        {
        }

        match(input,65,FOLLOW_47); if (state.failed) return ;
        match(input,50,FOLLOW_16); if (state.failed) return ;
        // PsiInternalKobold.g:2110:5: ( ( ruleJvmFormalParameter ) )
        // PsiInternalKobold.g:2111:6: ( ruleJvmFormalParameter )
        {
        // PsiInternalKobold.g:2111:6: ( ruleJvmFormalParameter )
        // PsiInternalKobold.g:2112:7: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_50);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,62,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_PsiInternalKobold

    // $ANTLR start synpred21_PsiInternalKobold
    public final void synpred21_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2214:4: ( ( () '[' ) )
        // PsiInternalKobold.g:2214:5: ( () '[' )
        {
        // PsiInternalKobold.g:2214:5: ( () '[' )
        // PsiInternalKobold.g:2215:5: () '['
        {
        // PsiInternalKobold.g:2215:5: ()
        // PsiInternalKobold.g:2216:5: 
        {
        }

        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_PsiInternalKobold

    // $ANTLR start synpred23_PsiInternalKobold
    public final void synpred23_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2510:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // PsiInternalKobold.g:2510:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // PsiInternalKobold.g:2510:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // PsiInternalKobold.g:2511:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // PsiInternalKobold.g:2511:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt117=2;
        int LA117_0 = input.LA(1);

        if ( (LA117_0==RULE_ID||LA117_0==34||LA117_0==50) ) {
            alt117=1;
        }
        switch (alt117) {
            case 1 :
                // PsiInternalKobold.g:2512:6: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // PsiInternalKobold.g:2512:6: ( ( ruleJvmFormalParameter ) )
                // PsiInternalKobold.g:2513:7: ( ruleJvmFormalParameter )
                {
                // PsiInternalKobold.g:2513:7: ( ruleJvmFormalParameter )
                // PsiInternalKobold.g:2514:8: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_42);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // PsiInternalKobold.g:2517:6: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop116:
                do {
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==49) ) {
                        alt116=1;
                    }


                    switch (alt116) {
                	case 1 :
                	    // PsiInternalKobold.g:2518:7: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_16); if (state.failed) return ;
                	    // PsiInternalKobold.g:2519:7: ( ( ruleJvmFormalParameter ) )
                	    // PsiInternalKobold.g:2520:8: ( ruleJvmFormalParameter )
                	    {
                	    // PsiInternalKobold.g:2520:8: ( ruleJvmFormalParameter )
                	    // PsiInternalKobold.g:2521:9: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_42);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop116;
                    }
                } while (true);


                }
                break;

        }

        // PsiInternalKobold.g:2526:5: ( ( '|' ) )
        // PsiInternalKobold.g:2527:6: ( '|' )
        {
        // PsiInternalKobold.g:2527:6: ( '|' )
        // PsiInternalKobold.g:2528:7: '|'
        {
        match(input,57,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_PsiInternalKobold

    // $ANTLR start synpred25_PsiInternalKobold
    public final void synpred25_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2896:5: ( 'else' )
        // PsiInternalKobold.g:2896:6: 'else'
        {
        match(input,60,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_PsiInternalKobold

    // $ANTLR start synpred26_PsiInternalKobold
    public final void synpred26_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:2952:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // PsiInternalKobold.g:2952:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // PsiInternalKobold.g:2952:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // PsiInternalKobold.g:2953:7: '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        match(input,50,FOLLOW_16); if (state.failed) return ;
        // PsiInternalKobold.g:2954:7: ( ( ruleJvmFormalParameter ) )
        // PsiInternalKobold.g:2955:8: ( ruleJvmFormalParameter )
        {
        // PsiInternalKobold.g:2955:8: ( ruleJvmFormalParameter )
        // PsiInternalKobold.g:2956:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_50);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,62,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_PsiInternalKobold

    // $ANTLR start synpred27_PsiInternalKobold
    public final void synpred27_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:3020:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )
        // PsiInternalKobold.g:3020:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // PsiInternalKobold.g:3020:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        // PsiInternalKobold.g:3021:7: ( ( ruleJvmFormalParameter ) ) ':'
        {
        // PsiInternalKobold.g:3021:7: ( ( ruleJvmFormalParameter ) )
        // PsiInternalKobold.g:3022:8: ( ruleJvmFormalParameter )
        {
        // PsiInternalKobold.g:3022:8: ( ruleJvmFormalParameter )
        // PsiInternalKobold.g:3023:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_50);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,62,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_PsiInternalKobold

    // $ANTLR start synpred29_PsiInternalKobold
    public final void synpred29_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:3807:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // PsiInternalKobold.g:3807:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // PsiInternalKobold.g:3807:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // PsiInternalKobold.g:3808:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // PsiInternalKobold.g:3808:6: ( ( ruleJvmTypeReference ) )
        // PsiInternalKobold.g:3809:7: ( ruleJvmTypeReference )
        {
        // PsiInternalKobold.g:3809:7: ( ruleJvmTypeReference )
        // PsiInternalKobold.g:3810:8: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_4);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // PsiInternalKobold.g:3813:6: ( ( ruleValidID ) )
        // PsiInternalKobold.g:3814:7: ( ruleValidID )
        {
        // PsiInternalKobold.g:3814:7: ( ruleValidID )
        // PsiInternalKobold.g:3815:8: ruleValidID
        {
        pushFollow(FOLLOW_2);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_PsiInternalKobold

    // $ANTLR start synpred30_PsiInternalKobold
    public final void synpred30_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4077:5: ( ( '(' ) )
        // PsiInternalKobold.g:4077:6: ( '(' )
        {
        // PsiInternalKobold.g:4077:6: ( '(' )
        // PsiInternalKobold.g:4078:6: '('
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_PsiInternalKobold

    // $ANTLR start synpred31_PsiInternalKobold
    public final void synpred31_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4099:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // PsiInternalKobold.g:4099:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // PsiInternalKobold.g:4099:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // PsiInternalKobold.g:4100:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // PsiInternalKobold.g:4100:7: ()
        // PsiInternalKobold.g:4101:7: 
        {
        }

        // PsiInternalKobold.g:4102:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==RULE_ID||LA121_0==34||LA121_0==50) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // PsiInternalKobold.g:4103:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // PsiInternalKobold.g:4103:8: ( ( ruleJvmFormalParameter ) )
                // PsiInternalKobold.g:4104:9: ( ruleJvmFormalParameter )
                {
                // PsiInternalKobold.g:4104:9: ( ruleJvmFormalParameter )
                // PsiInternalKobold.g:4105:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_42);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // PsiInternalKobold.g:4108:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop120:
                do {
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==49) ) {
                        alt120=1;
                    }


                    switch (alt120) {
                	case 1 :
                	    // PsiInternalKobold.g:4109:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_16); if (state.failed) return ;
                	    // PsiInternalKobold.g:4110:9: ( ( ruleJvmFormalParameter ) )
                	    // PsiInternalKobold.g:4111:10: ( ruleJvmFormalParameter )
                	    {
                	    // PsiInternalKobold.g:4111:10: ( ruleJvmFormalParameter )
                	    // PsiInternalKobold.g:4112:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_42);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop120;
                    }
                } while (true);


                }
                break;

        }

        // PsiInternalKobold.g:4117:7: ( ( '|' ) )
        // PsiInternalKobold.g:4118:8: ( '|' )
        {
        // PsiInternalKobold.g:4118:8: ( '|' )
        // PsiInternalKobold.g:4119:9: '|'
        {
        match(input,57,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_PsiInternalKobold

    // $ANTLR start synpred32_PsiInternalKobold
    public final void synpred32_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4190:4: ( ( () '[' ) )
        // PsiInternalKobold.g:4190:5: ( () '[' )
        {
        // PsiInternalKobold.g:4190:5: ( () '[' )
        // PsiInternalKobold.g:4191:5: () '['
        {
        // PsiInternalKobold.g:4191:5: ()
        // PsiInternalKobold.g:4192:5: 
        {
        }

        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_PsiInternalKobold

    // $ANTLR start synpred33_PsiInternalKobold
    public final void synpred33_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4339:5: ( '<' )
        // PsiInternalKobold.g:4339:6: '<'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_PsiInternalKobold

    // $ANTLR start synpred34_PsiInternalKobold
    public final void synpred34_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4397:5: ( ( '(' ) )
        // PsiInternalKobold.g:4397:6: ( '(' )
        {
        // PsiInternalKobold.g:4397:6: ( '(' )
        // PsiInternalKobold.g:4398:6: '('
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_PsiInternalKobold

    // $ANTLR start synpred35_PsiInternalKobold
    public final void synpred35_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4419:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // PsiInternalKobold.g:4419:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // PsiInternalKobold.g:4419:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // PsiInternalKobold.g:4420:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // PsiInternalKobold.g:4420:7: ()
        // PsiInternalKobold.g:4421:7: 
        {
        }

        // PsiInternalKobold.g:4422:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==RULE_ID||LA123_0==34||LA123_0==50) ) {
            alt123=1;
        }
        switch (alt123) {
            case 1 :
                // PsiInternalKobold.g:4423:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // PsiInternalKobold.g:4423:8: ( ( ruleJvmFormalParameter ) )
                // PsiInternalKobold.g:4424:9: ( ruleJvmFormalParameter )
                {
                // PsiInternalKobold.g:4424:9: ( ruleJvmFormalParameter )
                // PsiInternalKobold.g:4425:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_42);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // PsiInternalKobold.g:4428:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop122:
                do {
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==49) ) {
                        alt122=1;
                    }


                    switch (alt122) {
                	case 1 :
                	    // PsiInternalKobold.g:4429:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_16); if (state.failed) return ;
                	    // PsiInternalKobold.g:4430:9: ( ( ruleJvmFormalParameter ) )
                	    // PsiInternalKobold.g:4431:10: ( ruleJvmFormalParameter )
                	    {
                	    // PsiInternalKobold.g:4431:10: ( ruleJvmFormalParameter )
                	    // PsiInternalKobold.g:4432:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_42);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop122;
                    }
                } while (true);


                }
                break;

        }

        // PsiInternalKobold.g:4437:7: ( ( '|' ) )
        // PsiInternalKobold.g:4438:8: ( '|' )
        {
        // PsiInternalKobold.g:4438:8: ( '|' )
        // PsiInternalKobold.g:4439:9: '|'
        {
        match(input,57,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_PsiInternalKobold

    // $ANTLR start synpred36_PsiInternalKobold
    public final void synpred36_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4510:4: ( ( () '[' ) )
        // PsiInternalKobold.g:4510:5: ( () '[' )
        {
        // PsiInternalKobold.g:4510:5: ( () '[' )
        // PsiInternalKobold.g:4511:5: () '['
        {
        // PsiInternalKobold.g:4511:5: ()
        // PsiInternalKobold.g:4512:5: 
        {
        }

        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_PsiInternalKobold

    // $ANTLR start synpred37_PsiInternalKobold
    public final void synpred37_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4826:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )
        // PsiInternalKobold.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_DECIMAL)||input.LA(1)==14||input.LA(1)==21||(input.LA(1)>=37 && input.LA(1)<=38)||input.LA(1)==50||(input.LA(1)>=52 && input.LA(1)<=53)||input.LA(1)==55||input.LA(1)==59||input.LA(1)==61||(input.LA(1)>=65 && input.LA(1)<=67)||(input.LA(1)>=70 && input.LA(1)<=82)||input.LA(1)==84 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred37_PsiInternalKobold

    // $ANTLR start synpred38_PsiInternalKobold
    public final void synpred38_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4887:6: ( 'catch' )
        // PsiInternalKobold.g:4887:7: 'catch'
        {
        match(input,85,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_PsiInternalKobold

    // $ANTLR start synpred39_PsiInternalKobold
    public final void synpred39_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:4904:7: ( 'finally' )
        // PsiInternalKobold.g:4904:8: 'finally'
        {
        match(input,83,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_PsiInternalKobold

    // $ANTLR start synpred42_PsiInternalKobold
    public final void synpred42_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:5130:5: ( '.' )
        // PsiInternalKobold.g:5130:6: '.'
        {
        match(input,46,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_PsiInternalKobold

    // $ANTLR start synpred43_PsiInternalKobold
    public final void synpred43_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:5248:5: ( ( () ruleArrayBrackets ) )
        // PsiInternalKobold.g:5248:6: ( () ruleArrayBrackets )
        {
        // PsiInternalKobold.g:5248:6: ( () ruleArrayBrackets )
        // PsiInternalKobold.g:5249:6: () ruleArrayBrackets
        {
        // PsiInternalKobold.g:5249:6: ()
        // PsiInternalKobold.g:5250:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred43_PsiInternalKobold

    // $ANTLR start synpred44_PsiInternalKobold
    public final void synpred44_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:5435:5: ( '<' )
        // PsiInternalKobold.g:5435:6: '<'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_PsiInternalKobold

    // $ANTLR start synpred45_PsiInternalKobold
    public final void synpred45_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:5492:6: ( ( () '.' ) )
        // PsiInternalKobold.g:5492:7: ( () '.' )
        {
        // PsiInternalKobold.g:5492:7: ( () '.' )
        // PsiInternalKobold.g:5493:7: () '.'
        {
        // PsiInternalKobold.g:5493:7: ()
        // PsiInternalKobold.g:5494:7: 
        {
        }

        match(input,46,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_PsiInternalKobold

    // $ANTLR start synpred46_PsiInternalKobold
    public final void synpred46_PsiInternalKobold_fragment() throws RecognitionException {   
        // PsiInternalKobold.g:5534:7: ( '<' )
        // PsiInternalKobold.g:5534:8: '<'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_PsiInternalKobold

    // Delegated rules

    public final boolean synpred14_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_PsiInternalKobold() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_PsiInternalKobold_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\11\uffff";
    static final String dfa_3s = "\1\4\7\0\2\uffff";
    static final String dfa_4s = "\1\125\7\0\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\1\uffff\1\0\1\3\1\1\1\4\1\2\1\5\1\6\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\10\5\uffff\1\10\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\42\10\1\uffff\34\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "212:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_PsiInternalKobold()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\4\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\125\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\3\1\0\1\5\1\1\1\4\1\7\1\6\1\2\1\uffff}>";
    static final String[] dfa_14s = {
            "\5\1\5\uffff\1\1\1\uffff\5\1\1\2\1\3\10\1\1\4\1\5\1\6\1\7\1\10\1\11\24\1\1\uffff\34\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 901:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_PsiInternalKobold()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\25\2\uffff\1\26\7\uffff";
    static final String dfa_16s = "\1\44\2\uffff\1\41\7\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\6\1\3";
    static final String dfa_18s = "\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\3\10\uffff\1\1\1\2\1\4\1\5\1\7\1\10",
            "",
            "",
            "\1\11\12\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "969:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )";
        }
    }
    static final String dfa_20s = "\116\uffff";
    static final String dfa_21s = "\1\2\115\uffff";
    static final String dfa_22s = "\1\4\1\0\114\uffff";
    static final String dfa_23s = "\1\125\1\0\114\uffff";
    static final String dfa_24s = "\2\uffff\1\2\112\uffff\1\1";
    static final String dfa_25s = "\1\uffff\1\0\114\uffff}>";
    static final String[] dfa_26s = {
            "\5\2\5\uffff\1\2\1\uffff\42\2\1\1\6\2\1\uffff\34\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1881:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\44\uffff";
    static final String dfa_28s = "\1\4\2\0\41\uffff";
    static final String dfa_29s = "\1\124\2\0\41\uffff";
    static final String dfa_30s = "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String dfa_31s = "\1\0\1\1\1\2\41\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\4\5\5\uffff\1\5\6\uffff\1\5\14\uffff\1\3\2\uffff\2\5\13\uffff\1\2\1\43\2\5\1\uffff\1\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\15\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1903:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_ID) ) {s = 1;}

                        else if ( (LA30_0==50) ) {s = 2;}

                        else if ( (LA30_0==34) && (synpred17_PsiInternalKobold())) {s = 3;}

                        else if ( (LA30_0==57) && (synpred17_PsiInternalKobold())) {s = 4;}

                        else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_DECIMAL)||LA30_0==14||LA30_0==21||(LA30_0>=37 && LA30_0<=38)||(LA30_0>=52 && LA30_0<=53)||LA30_0==55||LA30_0==59||LA30_0==61||(LA30_0>=65 && LA30_0<=67)||(LA30_0>=70 && LA30_0<=82)||LA30_0==84) ) {s = 5;}

                        else if ( (LA30_0==51) ) {s = 35;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_33s = {
            "\5\2\5\uffff\1\2\1\uffff\47\2\1\1\1\2\1\uffff\34\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1995:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\40\uffff";
    static final String dfa_35s = "\1\4\26\uffff\1\0\10\uffff";
    static final String dfa_36s = "\1\124\26\uffff\1\0\10\uffff";
    static final String dfa_37s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\6\11\uffff\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\11";
    static final String dfa_38s = "\1\0\26\uffff\1\1\10\uffff}>";
    static final String[] dfa_39s = {
            "\1\5\4\14\14\uffff\1\5\34\uffff\1\35\1\uffff\1\14\1\2\1\uffff\1\14\3\uffff\1\26\1\uffff\1\3\3\uffff\1\27\1\30\1\31\2\uffff\5\5\1\1\4\14\1\32\1\33\1\34\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "2031:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==75) ) {s = 1;}

                        else if ( (LA34_0==53) ) {s = 2;}

                        else if ( (LA34_0==61) ) {s = 3;}

                        else if ( (LA34_0==84) && (synpred19_PsiInternalKobold())) {s = 4;}

                        else if ( (LA34_0==RULE_ID||LA34_0==21||(LA34_0>=70 && LA34_0<=74)) ) {s = 5;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==52||LA34_0==55||(LA34_0>=76 && LA34_0<=79)) ) {s = 12;}

                        else if ( (LA34_0==59) ) {s = 22;}

                        else if ( (LA34_0==65) ) {s = 23;}

                        else if ( (LA34_0==66) ) {s = 24;}

                        else if ( (LA34_0==67) ) {s = 25;}

                        else if ( (LA34_0==80) ) {s = 26;}

                        else if ( (LA34_0==81) ) {s = 27;}

                        else if ( (LA34_0==82) ) {s = 28;}

                        else if ( (LA34_0==50) ) {s = 29;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_23 = input.LA(1);

                         
                        int index34_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_PsiInternalKobold()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index34_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\46\uffff";
    static final String dfa_41s = "\1\4\2\0\43\uffff";
    static final String dfa_42s = "\1\124\2\0\43\uffff";
    static final String dfa_43s = "\3\uffff\2\1\1\2\40\uffff";
    static final String dfa_44s = "\1\0\1\1\1\2\43\uffff}>";
    static final String[] dfa_45s = {
            "\1\1\4\5\5\uffff\1\5\6\uffff\1\5\14\uffff\1\3\2\uffff\2\5\13\uffff\1\2\1\uffff\2\5\1\uffff\2\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\22\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "2509:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==RULE_ID) ) {s = 1;}

                        else if ( (LA43_0==50) ) {s = 2;}

                        else if ( (LA43_0==34) && (synpred23_PsiInternalKobold())) {s = 3;}

                        else if ( (LA43_0==57) && (synpred23_PsiInternalKobold())) {s = 4;}

                        else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_DECIMAL)||LA43_0==14||LA43_0==21||(LA43_0>=37 && LA43_0<=38)||(LA43_0>=52 && LA43_0<=53)||(LA43_0>=55 && LA43_0<=56)||LA43_0==59||LA43_0==61||(LA43_0>=65 && LA43_0<=82)||LA43_0==84) ) {s = 5;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\43\uffff";
    static final String dfa_47s = "\1\4\1\0\41\uffff";
    static final String dfa_48s = "\1\124\1\0\41\uffff";
    static final String dfa_49s = "\2\uffff\1\2\37\uffff\1\1";
    static final String dfa_50s = "\1\uffff\1\0\41\uffff}>";
    static final String[] dfa_51s = {
            "\5\2\5\uffff\1\2\6\uffff\1\2\14\uffff\1\2\2\uffff\2\2\13\uffff\1\1\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "2949:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_PsiInternalKobold()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\42\uffff";
    static final String dfa_53s = "\1\4\2\0\37\uffff";
    static final String dfa_54s = "\1\124\2\0\37\uffff";
    static final String dfa_55s = "\3\uffff\1\1\1\2\35\uffff";
    static final String dfa_56s = "\1\0\1\1\1\2\37\uffff}>";
    static final String[] dfa_57s = {
            "\1\1\4\4\5\uffff\1\4\6\uffff\1\4\14\uffff\1\3\2\uffff\2\4\13\uffff\1\2\1\uffff\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\3\uffff\3\4\2\uffff\15\4\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_52;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "3019:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==RULE_ID) ) {s = 1;}

                        else if ( (LA49_0==50) ) {s = 2;}

                        else if ( (LA49_0==34) && (synpred27_PsiInternalKobold())) {s = 3;}

                        else if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_DECIMAL)||LA49_0==14||LA49_0==21||(LA49_0>=37 && LA49_0<=38)||(LA49_0>=52 && LA49_0<=53)||LA49_0==55||LA49_0==59||LA49_0==61||(LA49_0>=65 && LA49_0<=67)||(LA49_0>=70 && LA49_0<=82)||LA49_0==84) ) {s = 4;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_PsiInternalKobold()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_PsiInternalKobold()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4075:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4097:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_0 = input.LA(1);

                         
                        int index71_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA71_0==RULE_ID) ) {s = 1;}

                        else if ( (LA71_0==50) ) {s = 2;}

                        else if ( (LA71_0==34) && (synpred31_PsiInternalKobold())) {s = 3;}

                        else if ( (LA71_0==57) && (synpred31_PsiInternalKobold())) {s = 4;}

                        else if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_DECIMAL)||LA71_0==14||LA71_0==21||(LA71_0>=37 && LA71_0<=38)||(LA71_0>=52 && LA71_0<=53)||LA71_0==55||LA71_0==59||LA71_0==61||(LA71_0>=65 && LA71_0<=67)||(LA71_0>=70 && LA71_0<=82)||LA71_0==84) ) {s = 5;}

                        else if ( (LA71_0==51) ) {s = 35;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4189:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_58s = {
            "\5\2\5\uffff\1\2\1\uffff\5\2\1\1\43\2\1\uffff\34\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "4337:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4395:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4417:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_0 = input.LA(1);

                         
                        int index79_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA79_0==RULE_ID) ) {s = 1;}

                        else if ( (LA79_0==50) ) {s = 2;}

                        else if ( (LA79_0==34) && (synpred35_PsiInternalKobold())) {s = 3;}

                        else if ( (LA79_0==57) && (synpred35_PsiInternalKobold())) {s = 4;}

                        else if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_DECIMAL)||LA79_0==14||LA79_0==21||(LA79_0>=37 && LA79_0<=38)||(LA79_0>=52 && LA79_0<=53)||LA79_0==55||LA79_0==59||LA79_0==61||(LA79_0>=65 && LA79_0<=67)||(LA79_0>=70 && LA79_0<=82)||LA79_0==84) ) {s = 5;}

                        else if ( (LA79_0==51) ) {s = 35;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_PsiInternalKobold()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4509:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\1\41\115\uffff";
    static final String dfa_60s = "\1\4\40\0\55\uffff";
    static final String dfa_61s = "\1\125\40\0\55\uffff";
    static final String dfa_62s = "\41\uffff\1\2\53\uffff\1\1";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\55\uffff}>";
    static final String[] dfa_64s = {
            "\1\1\1\27\1\23\1\24\1\25\5\uffff\1\6\1\uffff\5\41\1\15\17\41\1\10\1\7\13\41\1\40\1\41\1\17\1\12\1\41\1\20\1\41\1\uffff\1\41\1\31\1\41\1\13\3\41\1\32\1\33\1\34\2\41\1\2\1\3\1\4\1\5\1\16\1\11\1\21\1\22\1\26\1\30\1\35\1\36\1\37\1\41\1\14\1\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_20;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "4825:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_2 = input.LA(1);

                         
                        int index84_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_3 = input.LA(1);

                         
                        int index84_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_5 = input.LA(1);

                         
                        int index84_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_6 = input.LA(1);

                         
                        int index84_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA84_9 = input.LA(1);

                         
                        int index84_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA84_10 = input.LA(1);

                         
                        int index84_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA84_11 = input.LA(1);

                         
                        int index84_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA84_12 = input.LA(1);

                         
                        int index84_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA84_13 = input.LA(1);

                         
                        int index84_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA84_14 = input.LA(1);

                         
                        int index84_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA84_15 = input.LA(1);

                         
                        int index84_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA84_16 = input.LA(1);

                         
                        int index84_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA84_17 = input.LA(1);

                         
                        int index84_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA84_18 = input.LA(1);

                         
                        int index84_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA84_19 = input.LA(1);

                         
                        int index84_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA84_20 = input.LA(1);

                         
                        int index84_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA84_21 = input.LA(1);

                         
                        int index84_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA84_22 = input.LA(1);

                         
                        int index84_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA84_23 = input.LA(1);

                         
                        int index84_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA84_24 = input.LA(1);

                         
                        int index84_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA84_25 = input.LA(1);

                         
                        int index84_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA84_26 = input.LA(1);

                         
                        int index84_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA84_27 = input.LA(1);

                         
                        int index84_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA84_28 = input.LA(1);

                         
                        int index84_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA84_29 = input.LA(1);

                         
                        int index84_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA84_30 = input.LA(1);

                         
                        int index84_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA84_31 = input.LA(1);

                         
                        int index84_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA84_32 = input.LA(1);

                         
                        int index84_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_PsiInternalKobold()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index84_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\117\uffff";
    static final String dfa_66s = "\1\2\116\uffff";
    static final String dfa_67s = "\1\4\1\0\115\uffff";
    static final String dfa_68s = "\1\127\1\0\115\uffff";
    static final String dfa_69s = "\2\uffff\1\2\113\uffff\1\1";
    static final String dfa_70s = "\1\uffff\1\0\115\uffff}>";
    static final String[] dfa_71s = {
            "\5\2\5\uffff\1\2\1\uffff\5\2\1\1\43\2\1\uffff\34\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "5433:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA102_1 = input.LA(1);

                         
                        int index102_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_PsiInternalKobold()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index102_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 102, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "5532:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_1 = input.LA(1);

                         
                        int index100_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_PsiInternalKobold()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_72s = "\7\uffff";
    static final String dfa_73s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_74s = "\1\4\1\uffff\1\56\1\4\2\uffff\1\56";
    static final String dfa_75s = "\1\107\1\uffff\1\72\1\47\2\uffff\1\72";
    static final String dfa_76s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_77s = "\7\uffff}>";
    static final String[] dfa_78s = {
            "\1\2\102\uffff\1\1",
            "",
            "\1\3\13\uffff\1\4",
            "\1\6\42\uffff\1\5",
            "",
            "",
            "\1\3\13\uffff\1\4"
    };

    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_72;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "5937:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x28B40060002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040E00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000400000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001F80600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L,0x00000000000003C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200010L,0x00000000000007C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000400000010L,0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0085C00000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2ABC0064002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0081C00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x28F40060002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x29B40060002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2BB40064002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x29B40060002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2CB40060002041F2L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x28B40060002041F2L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x28B40064002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xC046000400000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4002000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4002000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2CB40060002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0402000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x28B40060002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2CB40060002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x28BC0060002041F0L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x28F40060002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2CF40060002041F0L,0x000000000017FFFEL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0084000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0084000000200002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x28B40060002041F2L,0x000000000017FFCEL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000280000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000280000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x000C000400000010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000400000200002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000440L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000012L});

}