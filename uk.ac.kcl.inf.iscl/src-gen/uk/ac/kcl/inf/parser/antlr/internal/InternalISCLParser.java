package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.services.ISCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalISCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ADDRESS", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'between'", "'company'", "'and'", "','", "'for'", "'Terms'", "'{'", "'Upon violation'", "'}'", "'Amount of'", "'payable every'", "'days'", "'%'", "'increase per claim'", "'claimed'", "'by'", "'cancelled'", "'claim reduced by'", "'premium increased by'", "'customer with address'", "'is'", "'participates with'", "'with address'", "'object'", "'owned by'", "'.'", "'personal'", "'pool'", "'family'", "'beneficiary'", "'owner'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int RULE_ADDRESS=5;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalISCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalISCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalISCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalISCL.g"; }



     	private ISCLGrammarAccess grammarAccess;

        public InternalISCLParser(TokenStream input, ISCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Contract";
       	}

       	@Override
       	protected ISCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContract"
    // InternalISCL.g:65:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalISCL.g:65:49: (iv_ruleContract= ruleContract EOF )
            // InternalISCL.g:66:2: iv_ruleContract= ruleContract EOF
            {
             newCompositeNode(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;

             current =iv_ruleContract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalISCL.g:72:1: ruleContract returns [EObject current=null] : ( ( (lv_type_0_0= ruleContractType ) ) otherlv_1= 'contract' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'between' otherlv_4= 'company' ( (lv_company_5_0= ruleCompany ) ) otherlv_6= 'and' ( (lv_customers_7_0= ruleCustomer ) ) (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )* otherlv_10= 'for' ( (lv_insurableObjects_11_0= ruleInsurableObject ) ) (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )* otherlv_14= 'Terms' otherlv_15= '{' ( (lv_paymentTerm_16_0= rulePaymentTerm ) ) ( (lv_claimTerm_17_0= ruleClaimTerm ) ) (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )? otherlv_22= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_company_5_0 = null;

        EObject lv_customers_7_0 = null;

        EObject lv_customers_9_0 = null;

        EObject lv_insurableObjects_11_0 = null;

        EObject lv_insurableObjects_13_0 = null;

        EObject lv_paymentTerm_16_0 = null;

        EObject lv_claimTerm_17_0 = null;

        EObject lv_violationTerms_19_0 = null;

        EObject lv_violationTerms_21_0 = null;



        	enterRule();

        try {
            // InternalISCL.g:78:2: ( ( ( (lv_type_0_0= ruleContractType ) ) otherlv_1= 'contract' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'between' otherlv_4= 'company' ( (lv_company_5_0= ruleCompany ) ) otherlv_6= 'and' ( (lv_customers_7_0= ruleCustomer ) ) (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )* otherlv_10= 'for' ( (lv_insurableObjects_11_0= ruleInsurableObject ) ) (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )* otherlv_14= 'Terms' otherlv_15= '{' ( (lv_paymentTerm_16_0= rulePaymentTerm ) ) ( (lv_claimTerm_17_0= ruleClaimTerm ) ) (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )? otherlv_22= '}' ) )
            // InternalISCL.g:79:2: ( ( (lv_type_0_0= ruleContractType ) ) otherlv_1= 'contract' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'between' otherlv_4= 'company' ( (lv_company_5_0= ruleCompany ) ) otherlv_6= 'and' ( (lv_customers_7_0= ruleCustomer ) ) (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )* otherlv_10= 'for' ( (lv_insurableObjects_11_0= ruleInsurableObject ) ) (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )* otherlv_14= 'Terms' otherlv_15= '{' ( (lv_paymentTerm_16_0= rulePaymentTerm ) ) ( (lv_claimTerm_17_0= ruleClaimTerm ) ) (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )? otherlv_22= '}' )
            {
            // InternalISCL.g:79:2: ( ( (lv_type_0_0= ruleContractType ) ) otherlv_1= 'contract' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'between' otherlv_4= 'company' ( (lv_company_5_0= ruleCompany ) ) otherlv_6= 'and' ( (lv_customers_7_0= ruleCustomer ) ) (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )* otherlv_10= 'for' ( (lv_insurableObjects_11_0= ruleInsurableObject ) ) (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )* otherlv_14= 'Terms' otherlv_15= '{' ( (lv_paymentTerm_16_0= rulePaymentTerm ) ) ( (lv_claimTerm_17_0= ruleClaimTerm ) ) (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )? otherlv_22= '}' )
            // InternalISCL.g:80:3: ( (lv_type_0_0= ruleContractType ) ) otherlv_1= 'contract' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'between' otherlv_4= 'company' ( (lv_company_5_0= ruleCompany ) ) otherlv_6= 'and' ( (lv_customers_7_0= ruleCustomer ) ) (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )* otherlv_10= 'for' ( (lv_insurableObjects_11_0= ruleInsurableObject ) ) (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )* otherlv_14= 'Terms' otherlv_15= '{' ( (lv_paymentTerm_16_0= rulePaymentTerm ) ) ( (lv_claimTerm_17_0= ruleClaimTerm ) ) (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )? otherlv_22= '}'
            {
            // InternalISCL.g:80:3: ( (lv_type_0_0= ruleContractType ) )
            // InternalISCL.g:81:4: (lv_type_0_0= ruleContractType )
            {
            // InternalISCL.g:81:4: (lv_type_0_0= ruleContractType )
            // InternalISCL.g:82:5: lv_type_0_0= ruleContractType
            {

            					newCompositeNode(grammarAccess.getContractAccess().getTypeContractTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleContractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uk.ac.kcl.inf.ISCL.ContractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContractAccess().getContractKeyword_1());
            		
            // InternalISCL.g:103:3: ( (lv_name_2_0= ruleEString ) )
            // InternalISCL.g:104:4: (lv_name_2_0= ruleEString )
            {
            // InternalISCL.g:104:4: (lv_name_2_0= ruleEString )
            // InternalISCL.g:105:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContractAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uk.ac.kcl.inf.ISCL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getBetweenKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCompanyKeyword_4());
            		
            // InternalISCL.g:130:3: ( (lv_company_5_0= ruleCompany ) )
            // InternalISCL.g:131:4: (lv_company_5_0= ruleCompany )
            {
            // InternalISCL.g:131:4: (lv_company_5_0= ruleCompany )
            // InternalISCL.g:132:5: lv_company_5_0= ruleCompany
            {

            					newCompositeNode(grammarAccess.getContractAccess().getCompanyCompanyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_company_5_0=ruleCompany();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"company",
            						lv_company_5_0,
            						"uk.ac.kcl.inf.ISCL.Company");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getAndKeyword_6());
            		
            // InternalISCL.g:153:3: ( (lv_customers_7_0= ruleCustomer ) )
            // InternalISCL.g:154:4: (lv_customers_7_0= ruleCustomer )
            {
            // InternalISCL.g:154:4: (lv_customers_7_0= ruleCustomer )
            // InternalISCL.g:155:5: lv_customers_7_0= ruleCustomer
            {

            					newCompositeNode(grammarAccess.getContractAccess().getCustomersCustomerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_customers_7_0=ruleCustomer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					add(
            						current,
            						"customers",
            						lv_customers_7_0,
            						"uk.ac.kcl.inf.ISCL.Customer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalISCL.g:172:3: (otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalISCL.g:173:4: otherlv_8= ',' ( (lv_customers_9_0= ruleCustomer ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_8, grammarAccess.getContractAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalISCL.g:177:4: ( (lv_customers_9_0= ruleCustomer ) )
            	    // InternalISCL.g:178:5: (lv_customers_9_0= ruleCustomer )
            	    {
            	    // InternalISCL.g:178:5: (lv_customers_9_0= ruleCustomer )
            	    // InternalISCL.g:179:6: lv_customers_9_0= ruleCustomer
            	    {

            	    						newCompositeNode(grammarAccess.getContractAccess().getCustomersCustomerParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_customers_9_0=ruleCustomer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"customers",
            	    							lv_customers_9_0,
            	    							"uk.ac.kcl.inf.ISCL.Customer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getForKeyword_9());
            		
            // InternalISCL.g:201:3: ( (lv_insurableObjects_11_0= ruleInsurableObject ) )
            // InternalISCL.g:202:4: (lv_insurableObjects_11_0= ruleInsurableObject )
            {
            // InternalISCL.g:202:4: (lv_insurableObjects_11_0= ruleInsurableObject )
            // InternalISCL.g:203:5: lv_insurableObjects_11_0= ruleInsurableObject
            {

            					newCompositeNode(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_insurableObjects_11_0=ruleInsurableObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					add(
            						current,
            						"insurableObjects",
            						lv_insurableObjects_11_0,
            						"uk.ac.kcl.inf.ISCL.InsurableObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalISCL.g:220:3: (otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalISCL.g:221:4: otherlv_12= ',' ( (lv_insurableObjects_13_0= ruleInsurableObject ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_12, grammarAccess.getContractAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalISCL.g:225:4: ( (lv_insurableObjects_13_0= ruleInsurableObject ) )
            	    // InternalISCL.g:226:5: (lv_insurableObjects_13_0= ruleInsurableObject )
            	    {
            	    // InternalISCL.g:226:5: (lv_insurableObjects_13_0= ruleInsurableObject )
            	    // InternalISCL.g:227:6: lv_insurableObjects_13_0= ruleInsurableObject
            	    {

            	    						newCompositeNode(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_insurableObjects_13_0=ruleInsurableObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"insurableObjects",
            	    							lv_insurableObjects_13_0,
            	    							"uk.ac.kcl.inf.ISCL.InsurableObject");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getContractAccess().getTermsKeyword_12());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalISCL.g:253:3: ( (lv_paymentTerm_16_0= rulePaymentTerm ) )
            // InternalISCL.g:254:4: (lv_paymentTerm_16_0= rulePaymentTerm )
            {
            // InternalISCL.g:254:4: (lv_paymentTerm_16_0= rulePaymentTerm )
            // InternalISCL.g:255:5: lv_paymentTerm_16_0= rulePaymentTerm
            {

            					newCompositeNode(grammarAccess.getContractAccess().getPaymentTermPaymentTermParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_paymentTerm_16_0=rulePaymentTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"paymentTerm",
            						lv_paymentTerm_16_0,
            						"uk.ac.kcl.inf.ISCL.PaymentTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalISCL.g:272:3: ( (lv_claimTerm_17_0= ruleClaimTerm ) )
            // InternalISCL.g:273:4: (lv_claimTerm_17_0= ruleClaimTerm )
            {
            // InternalISCL.g:273:4: (lv_claimTerm_17_0= ruleClaimTerm )
            // InternalISCL.g:274:5: lv_claimTerm_17_0= ruleClaimTerm
            {

            					newCompositeNode(grammarAccess.getContractAccess().getClaimTermClaimTermParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_15);
            lv_claimTerm_17_0=ruleClaimTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"claimTerm",
            						lv_claimTerm_17_0,
            						"uk.ac.kcl.inf.ISCL.ClaimTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalISCL.g:291:3: (otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalISCL.g:292:4: otherlv_18= 'Upon violation' ( (lv_violationTerms_19_0= ruleViolationTerm ) ) (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )*
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getContractAccess().getUponViolationKeyword_16_0());
                    			
                    // InternalISCL.g:296:4: ( (lv_violationTerms_19_0= ruleViolationTerm ) )
                    // InternalISCL.g:297:5: (lv_violationTerms_19_0= ruleViolationTerm )
                    {
                    // InternalISCL.g:297:5: (lv_violationTerms_19_0= ruleViolationTerm )
                    // InternalISCL.g:298:6: lv_violationTerms_19_0= ruleViolationTerm
                    {

                    						newCompositeNode(grammarAccess.getContractAccess().getViolationTermsViolationTermParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_violationTerms_19_0=ruleViolationTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContractRule());
                    						}
                    						add(
                    							current,
                    							"violationTerms",
                    							lv_violationTerms_19_0,
                    							"uk.ac.kcl.inf.ISCL.ViolationTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalISCL.g:315:4: (otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalISCL.g:316:5: otherlv_20= ',' ( (lv_violationTerms_21_0= ruleViolationTerm ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getContractAccess().getCommaKeyword_16_2_0());
                    	    				
                    	    // InternalISCL.g:320:5: ( (lv_violationTerms_21_0= ruleViolationTerm ) )
                    	    // InternalISCL.g:321:6: (lv_violationTerms_21_0= ruleViolationTerm )
                    	    {
                    	    // InternalISCL.g:321:6: (lv_violationTerms_21_0= ruleViolationTerm )
                    	    // InternalISCL.g:322:7: lv_violationTerms_21_0= ruleViolationTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getViolationTermsViolationTermParserRuleCall_16_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_violationTerms_21_0=ruleViolationTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"violationTerms",
                    	    								lv_violationTerms_21_0,
                    	    								"uk.ac.kcl.inf.ISCL.ViolationTerm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRulePaymentTerm"
    // InternalISCL.g:349:1: entryRulePaymentTerm returns [EObject current=null] : iv_rulePaymentTerm= rulePaymentTerm EOF ;
    public final EObject entryRulePaymentTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentTerm = null;


        try {
            // InternalISCL.g:349:52: (iv_rulePaymentTerm= rulePaymentTerm EOF )
            // InternalISCL.g:350:2: iv_rulePaymentTerm= rulePaymentTerm EOF
            {
             newCompositeNode(grammarAccess.getPaymentTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaymentTerm=rulePaymentTerm();

            state._fsp--;

             current =iv_rulePaymentTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaymentTerm"


    // $ANTLR start "rulePaymentTerm"
    // InternalISCL.g:356:1: rulePaymentTerm returns [EObject current=null] : (otherlv_0= 'Amount of' ( (lv_premium_1_0= ruleREAL ) ) otherlv_2= 'payable every' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'days' ( (lv_increase_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= 'increase per claim' ) ;
    public final EObject rulePaymentTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_period_3_0=null;
        Token otherlv_4=null;
        Token lv_increase_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_premium_1_0 = null;



        	enterRule();

        try {
            // InternalISCL.g:362:2: ( (otherlv_0= 'Amount of' ( (lv_premium_1_0= ruleREAL ) ) otherlv_2= 'payable every' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'days' ( (lv_increase_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= 'increase per claim' ) )
            // InternalISCL.g:363:2: (otherlv_0= 'Amount of' ( (lv_premium_1_0= ruleREAL ) ) otherlv_2= 'payable every' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'days' ( (lv_increase_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= 'increase per claim' )
            {
            // InternalISCL.g:363:2: (otherlv_0= 'Amount of' ( (lv_premium_1_0= ruleREAL ) ) otherlv_2= 'payable every' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'days' ( (lv_increase_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= 'increase per claim' )
            // InternalISCL.g:364:3: otherlv_0= 'Amount of' ( (lv_premium_1_0= ruleREAL ) ) otherlv_2= 'payable every' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'days' ( (lv_increase_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= 'increase per claim'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentTermAccess().getAmountOfKeyword_0());
            		
            // InternalISCL.g:368:3: ( (lv_premium_1_0= ruleREAL ) )
            // InternalISCL.g:369:4: (lv_premium_1_0= ruleREAL )
            {
            // InternalISCL.g:369:4: (lv_premium_1_0= ruleREAL )
            // InternalISCL.g:370:5: lv_premium_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getPaymentTermAccess().getPremiumREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_premium_1_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaymentTermRule());
            					}
            					set(
            						current,
            						"premium",
            						lv_premium_1_0,
            						"uk.ac.kcl.inf.ISCL.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentTermAccess().getPayableEveryKeyword_2());
            		
            // InternalISCL.g:391:3: ( (lv_period_3_0= RULE_INT ) )
            // InternalISCL.g:392:4: (lv_period_3_0= RULE_INT )
            {
            // InternalISCL.g:392:4: (lv_period_3_0= RULE_INT )
            // InternalISCL.g:393:5: lv_period_3_0= RULE_INT
            {
            lv_period_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_period_3_0, grammarAccess.getPaymentTermAccess().getPeriodINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"period",
            						lv_period_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getPaymentTermAccess().getDaysKeyword_4());
            		
            // InternalISCL.g:413:3: ( (lv_increase_5_0= RULE_INT ) )
            // InternalISCL.g:414:4: (lv_increase_5_0= RULE_INT )
            {
            // InternalISCL.g:414:4: (lv_increase_5_0= RULE_INT )
            // InternalISCL.g:415:5: lv_increase_5_0= RULE_INT
            {
            lv_increase_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_increase_5_0, grammarAccess.getPaymentTermAccess().getIncreaseINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"increase",
            						lv_increase_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getPaymentTermAccess().getPercentSignKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPaymentTermAccess().getIncreasePerClaimKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaymentTerm"


    // $ANTLR start "entryRuleClaimTerm"
    // InternalISCL.g:443:1: entryRuleClaimTerm returns [EObject current=null] : iv_ruleClaimTerm= ruleClaimTerm EOF ;
    public final EObject entryRuleClaimTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaimTerm = null;


        try {
            // InternalISCL.g:443:50: (iv_ruleClaimTerm= ruleClaimTerm EOF )
            // InternalISCL.g:444:2: iv_ruleClaimTerm= ruleClaimTerm EOF
            {
             newCompositeNode(grammarAccess.getClaimTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClaimTerm=ruleClaimTerm();

            state._fsp--;

             current =iv_ruleClaimTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClaimTerm"


    // $ANTLR start "ruleClaimTerm"
    // InternalISCL.g:450:1: ruleClaimTerm returns [EObject current=null] : (otherlv_0= 'Amount of' ( (lv_claim_1_0= ruleREAL ) ) otherlv_2= 'claimed' (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )? ) ;
    public final EObject ruleClaimTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_claim_1_0 = null;



        	enterRule();

        try {
            // InternalISCL.g:456:2: ( (otherlv_0= 'Amount of' ( (lv_claim_1_0= ruleREAL ) ) otherlv_2= 'claimed' (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )? ) )
            // InternalISCL.g:457:2: (otherlv_0= 'Amount of' ( (lv_claim_1_0= ruleREAL ) ) otherlv_2= 'claimed' (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )? )
            {
            // InternalISCL.g:457:2: (otherlv_0= 'Amount of' ( (lv_claim_1_0= ruleREAL ) ) otherlv_2= 'claimed' (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )? )
            // InternalISCL.g:458:3: otherlv_0= 'Amount of' ( (lv_claim_1_0= ruleREAL ) ) otherlv_2= 'claimed' (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getClaimTermAccess().getAmountOfKeyword_0());
            		
            // InternalISCL.g:462:3: ( (lv_claim_1_0= ruleREAL ) )
            // InternalISCL.g:463:4: (lv_claim_1_0= ruleREAL )
            {
            // InternalISCL.g:463:4: (lv_claim_1_0= ruleREAL )
            // InternalISCL.g:464:5: lv_claim_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getClaimTermAccess().getClaimREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_claim_1_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClaimTermRule());
            					}
            					set(
            						current,
            						"claim",
            						lv_claim_1_0,
            						"uk.ac.kcl.inf.ISCL.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getClaimTermAccess().getClaimedKeyword_2());
            		
            // InternalISCL.g:485:3: (otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalISCL.g:486:4: otherlv_3= 'by' ( (otherlv_4= RULE_ADDRESS ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getClaimTermAccess().getByKeyword_3_0());
                    			
                    // InternalISCL.g:490:4: ( (otherlv_4= RULE_ADDRESS ) )
                    // InternalISCL.g:491:5: (otherlv_4= RULE_ADDRESS )
                    {
                    // InternalISCL.g:491:5: (otherlv_4= RULE_ADDRESS )
                    // InternalISCL.g:492:6: otherlv_4= RULE_ADDRESS
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClaimTermRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ADDRESS,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getClaimTermAccess().getClaimerCustomerCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClaimTerm"


    // $ANTLR start "entryRuleViolationTerm"
    // InternalISCL.g:508:1: entryRuleViolationTerm returns [EObject current=null] : iv_ruleViolationTerm= ruleViolationTerm EOF ;
    public final EObject entryRuleViolationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViolationTerm = null;


        try {
            // InternalISCL.g:508:54: (iv_ruleViolationTerm= ruleViolationTerm EOF )
            // InternalISCL.g:509:2: iv_ruleViolationTerm= ruleViolationTerm EOF
            {
             newCompositeNode(grammarAccess.getViolationTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViolationTerm=ruleViolationTerm();

            state._fsp--;

             current =iv_ruleViolationTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViolationTerm"


    // $ANTLR start "ruleViolationTerm"
    // InternalISCL.g:515:1: ruleViolationTerm returns [EObject current=null] : (this_ContractCancellationTerm_0= ruleContractCancellationTerm | this_ClaimReductionTerm_1= ruleClaimReductionTerm | this_PremiumIncreaseTerm_2= rulePremiumIncreaseTerm ) ;
    public final EObject ruleViolationTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ContractCancellationTerm_0 = null;

        EObject this_ClaimReductionTerm_1 = null;

        EObject this_PremiumIncreaseTerm_2 = null;



        	enterRule();

        try {
            // InternalISCL.g:521:2: ( (this_ContractCancellationTerm_0= ruleContractCancellationTerm | this_ClaimReductionTerm_1= ruleClaimReductionTerm | this_PremiumIncreaseTerm_2= rulePremiumIncreaseTerm ) )
            // InternalISCL.g:522:2: (this_ContractCancellationTerm_0= ruleContractCancellationTerm | this_ClaimReductionTerm_1= ruleClaimReductionTerm | this_PremiumIncreaseTerm_2= rulePremiumIncreaseTerm )
            {
            // InternalISCL.g:522:2: (this_ContractCancellationTerm_0= ruleContractCancellationTerm | this_ClaimReductionTerm_1= ruleClaimReductionTerm | this_PremiumIncreaseTerm_2= rulePremiumIncreaseTerm )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalISCL.g:523:3: this_ContractCancellationTerm_0= ruleContractCancellationTerm
                    {

                    			newCompositeNode(grammarAccess.getViolationTermAccess().getContractCancellationTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContractCancellationTerm_0=ruleContractCancellationTerm();

                    state._fsp--;


                    			current = this_ContractCancellationTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalISCL.g:532:3: this_ClaimReductionTerm_1= ruleClaimReductionTerm
                    {

                    			newCompositeNode(grammarAccess.getViolationTermAccess().getClaimReductionTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClaimReductionTerm_1=ruleClaimReductionTerm();

                    state._fsp--;


                    			current = this_ClaimReductionTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalISCL.g:541:3: this_PremiumIncreaseTerm_2= rulePremiumIncreaseTerm
                    {

                    			newCompositeNode(grammarAccess.getViolationTermAccess().getPremiumIncreaseTermParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PremiumIncreaseTerm_2=rulePremiumIncreaseTerm();

                    state._fsp--;


                    			current = this_PremiumIncreaseTerm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViolationTerm"


    // $ANTLR start "entryRuleContractCancellationTerm"
    // InternalISCL.g:553:1: entryRuleContractCancellationTerm returns [EObject current=null] : iv_ruleContractCancellationTerm= ruleContractCancellationTerm EOF ;
    public final EObject entryRuleContractCancellationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractCancellationTerm = null;


        try {
            // InternalISCL.g:553:65: (iv_ruleContractCancellationTerm= ruleContractCancellationTerm EOF )
            // InternalISCL.g:554:2: iv_ruleContractCancellationTerm= ruleContractCancellationTerm EOF
            {
             newCompositeNode(grammarAccess.getContractCancellationTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractCancellationTerm=ruleContractCancellationTerm();

            state._fsp--;

             current =iv_ruleContractCancellationTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContractCancellationTerm"


    // $ANTLR start "ruleContractCancellationTerm"
    // InternalISCL.g:560:1: ruleContractCancellationTerm returns [EObject current=null] : ( (lv_cancelled_0_0= 'cancelled' ) ) ;
    public final EObject ruleContractCancellationTerm() throws RecognitionException {
        EObject current = null;

        Token lv_cancelled_0_0=null;


        	enterRule();

        try {
            // InternalISCL.g:566:2: ( ( (lv_cancelled_0_0= 'cancelled' ) ) )
            // InternalISCL.g:567:2: ( (lv_cancelled_0_0= 'cancelled' ) )
            {
            // InternalISCL.g:567:2: ( (lv_cancelled_0_0= 'cancelled' ) )
            // InternalISCL.g:568:3: (lv_cancelled_0_0= 'cancelled' )
            {
            // InternalISCL.g:568:3: (lv_cancelled_0_0= 'cancelled' )
            // InternalISCL.g:569:4: lv_cancelled_0_0= 'cancelled'
            {
            lv_cancelled_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_cancelled_0_0, grammarAccess.getContractCancellationTermAccess().getCancelledCancelledKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getContractCancellationTermRule());
            				}
            				setWithLastConsumed(current, "cancelled", true, "cancelled");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractCancellationTerm"


    // $ANTLR start "entryRuleClaimReductionTerm"
    // InternalISCL.g:584:1: entryRuleClaimReductionTerm returns [EObject current=null] : iv_ruleClaimReductionTerm= ruleClaimReductionTerm EOF ;
    public final EObject entryRuleClaimReductionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaimReductionTerm = null;


        try {
            // InternalISCL.g:584:59: (iv_ruleClaimReductionTerm= ruleClaimReductionTerm EOF )
            // InternalISCL.g:585:2: iv_ruleClaimReductionTerm= ruleClaimReductionTerm EOF
            {
             newCompositeNode(grammarAccess.getClaimReductionTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClaimReductionTerm=ruleClaimReductionTerm();

            state._fsp--;

             current =iv_ruleClaimReductionTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClaimReductionTerm"


    // $ANTLR start "ruleClaimReductionTerm"
    // InternalISCL.g:591:1: ruleClaimReductionTerm returns [EObject current=null] : (otherlv_0= 'claim reduced by' ( (lv_claimReduction_1_0= RULE_INT ) ) otherlv_2= '%' ) ;
    public final EObject ruleClaimReductionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_claimReduction_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalISCL.g:597:2: ( (otherlv_0= 'claim reduced by' ( (lv_claimReduction_1_0= RULE_INT ) ) otherlv_2= '%' ) )
            // InternalISCL.g:598:2: (otherlv_0= 'claim reduced by' ( (lv_claimReduction_1_0= RULE_INT ) ) otherlv_2= '%' )
            {
            // InternalISCL.g:598:2: (otherlv_0= 'claim reduced by' ( (lv_claimReduction_1_0= RULE_INT ) ) otherlv_2= '%' )
            // InternalISCL.g:599:3: otherlv_0= 'claim reduced by' ( (lv_claimReduction_1_0= RULE_INT ) ) otherlv_2= '%'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getClaimReductionTermAccess().getClaimReducedByKeyword_0());
            		
            // InternalISCL.g:603:3: ( (lv_claimReduction_1_0= RULE_INT ) )
            // InternalISCL.g:604:4: (lv_claimReduction_1_0= RULE_INT )
            {
            // InternalISCL.g:604:4: (lv_claimReduction_1_0= RULE_INT )
            // InternalISCL.g:605:5: lv_claimReduction_1_0= RULE_INT
            {
            lv_claimReduction_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_claimReduction_1_0, grammarAccess.getClaimReductionTermAccess().getClaimReductionINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClaimReductionTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"claimReduction",
            						lv_claimReduction_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getClaimReductionTermAccess().getPercentSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClaimReductionTerm"


    // $ANTLR start "entryRulePremiumIncreaseTerm"
    // InternalISCL.g:629:1: entryRulePremiumIncreaseTerm returns [EObject current=null] : iv_rulePremiumIncreaseTerm= rulePremiumIncreaseTerm EOF ;
    public final EObject entryRulePremiumIncreaseTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePremiumIncreaseTerm = null;


        try {
            // InternalISCL.g:629:60: (iv_rulePremiumIncreaseTerm= rulePremiumIncreaseTerm EOF )
            // InternalISCL.g:630:2: iv_rulePremiumIncreaseTerm= rulePremiumIncreaseTerm EOF
            {
             newCompositeNode(grammarAccess.getPremiumIncreaseTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePremiumIncreaseTerm=rulePremiumIncreaseTerm();

            state._fsp--;

             current =iv_rulePremiumIncreaseTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePremiumIncreaseTerm"


    // $ANTLR start "rulePremiumIncreaseTerm"
    // InternalISCL.g:636:1: rulePremiumIncreaseTerm returns [EObject current=null] : (otherlv_0= 'premium increased by' ( (lv_premiumIncrease_1_0= RULE_INT ) ) otherlv_2= '%' ) ;
    public final EObject rulePremiumIncreaseTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_premiumIncrease_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalISCL.g:642:2: ( (otherlv_0= 'premium increased by' ( (lv_premiumIncrease_1_0= RULE_INT ) ) otherlv_2= '%' ) )
            // InternalISCL.g:643:2: (otherlv_0= 'premium increased by' ( (lv_premiumIncrease_1_0= RULE_INT ) ) otherlv_2= '%' )
            {
            // InternalISCL.g:643:2: (otherlv_0= 'premium increased by' ( (lv_premiumIncrease_1_0= RULE_INT ) ) otherlv_2= '%' )
            // InternalISCL.g:644:3: otherlv_0= 'premium increased by' ( (lv_premiumIncrease_1_0= RULE_INT ) ) otherlv_2= '%'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPremiumIncreaseTermAccess().getPremiumIncreasedByKeyword_0());
            		
            // InternalISCL.g:648:3: ( (lv_premiumIncrease_1_0= RULE_INT ) )
            // InternalISCL.g:649:4: (lv_premiumIncrease_1_0= RULE_INT )
            {
            // InternalISCL.g:649:4: (lv_premiumIncrease_1_0= RULE_INT )
            // InternalISCL.g:650:5: lv_premiumIncrease_1_0= RULE_INT
            {
            lv_premiumIncrease_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_premiumIncrease_1_0, grammarAccess.getPremiumIncreaseTermAccess().getPremiumIncreaseINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPremiumIncreaseTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"premiumIncrease",
            						lv_premiumIncrease_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPremiumIncreaseTermAccess().getPercentSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePremiumIncreaseTerm"


    // $ANTLR start "entryRuleCustomer"
    // InternalISCL.g:674:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalISCL.g:674:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalISCL.g:675:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalISCL.g:681:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customer with address' ( (lv_name_1_0= RULE_ADDRESS ) ) (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )? (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )? ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_participation_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_coverage_3_0 = null;



        	enterRule();

        try {
            // InternalISCL.g:687:2: ( (otherlv_0= 'customer with address' ( (lv_name_1_0= RULE_ADDRESS ) ) (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )? (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )? ) )
            // InternalISCL.g:688:2: (otherlv_0= 'customer with address' ( (lv_name_1_0= RULE_ADDRESS ) ) (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )? (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )? )
            {
            // InternalISCL.g:688:2: (otherlv_0= 'customer with address' ( (lv_name_1_0= RULE_ADDRESS ) ) (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )? (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )? )
            // InternalISCL.g:689:3: otherlv_0= 'customer with address' ( (lv_name_1_0= RULE_ADDRESS ) ) (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )? (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerWithAddressKeyword_0());
            		
            // InternalISCL.g:693:3: ( (lv_name_1_0= RULE_ADDRESS ) )
            // InternalISCL.g:694:4: (lv_name_1_0= RULE_ADDRESS )
            {
            // InternalISCL.g:694:4: (lv_name_1_0= RULE_ADDRESS )
            // InternalISCL.g:695:5: lv_name_1_0= RULE_ADDRESS
            {
            lv_name_1_0=(Token)match(input,RULE_ADDRESS,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCustomerAccess().getNameADDRESSTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.ISCL.ADDRESS");
            				

            }


            }

            // InternalISCL.g:711:3: (otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalISCL.g:712:4: otherlv_2= 'is' ( (lv_coverage_3_0= ruleCoverage ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getIsKeyword_2_0());
                    			
                    // InternalISCL.g:716:4: ( (lv_coverage_3_0= ruleCoverage ) )
                    // InternalISCL.g:717:5: (lv_coverage_3_0= ruleCoverage )
                    {
                    // InternalISCL.g:717:5: (lv_coverage_3_0= ruleCoverage )
                    // InternalISCL.g:718:6: lv_coverage_3_0= ruleCoverage
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getCoverageCoverageEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_coverage_3_0=ruleCoverage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"coverage",
                    							lv_coverage_3_0,
                    							"uk.ac.kcl.inf.ISCL.Coverage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalISCL.g:736:3: (otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalISCL.g:737:4: otherlv_4= 'participates with' ( (lv_participation_5_0= RULE_INT ) ) otherlv_6= '%'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getParticipatesWithKeyword_3_0());
                    			
                    // InternalISCL.g:741:4: ( (lv_participation_5_0= RULE_INT ) )
                    // InternalISCL.g:742:5: (lv_participation_5_0= RULE_INT )
                    {
                    // InternalISCL.g:742:5: (lv_participation_5_0= RULE_INT )
                    // InternalISCL.g:743:6: lv_participation_5_0= RULE_INT
                    {
                    lv_participation_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_participation_5_0, grammarAccess.getCustomerAccess().getParticipationINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"participation",
                    							lv_participation_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getPercentSignKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleCompany"
    // InternalISCL.g:768:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalISCL.g:768:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalISCL.g:769:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalISCL.g:775:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'with address' ( (lv_name_1_0= RULE_ADDRESS ) ) ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalISCL.g:781:2: ( (otherlv_0= 'with address' ( (lv_name_1_0= RULE_ADDRESS ) ) ) )
            // InternalISCL.g:782:2: (otherlv_0= 'with address' ( (lv_name_1_0= RULE_ADDRESS ) ) )
            {
            // InternalISCL.g:782:2: (otherlv_0= 'with address' ( (lv_name_1_0= RULE_ADDRESS ) ) )
            // InternalISCL.g:783:3: otherlv_0= 'with address' ( (lv_name_1_0= RULE_ADDRESS ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getWithAddressKeyword_0());
            		
            // InternalISCL.g:787:3: ( (lv_name_1_0= RULE_ADDRESS ) )
            // InternalISCL.g:788:4: (lv_name_1_0= RULE_ADDRESS )
            {
            // InternalISCL.g:788:4: (lv_name_1_0= RULE_ADDRESS )
            // InternalISCL.g:789:5: lv_name_1_0= RULE_ADDRESS
            {
            lv_name_1_0=(Token)match(input,RULE_ADDRESS,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompanyAccess().getNameADDRESSTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.ISCL.ADDRESS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleInsurableObject"
    // InternalISCL.g:809:1: entryRuleInsurableObject returns [EObject current=null] : iv_ruleInsurableObject= ruleInsurableObject EOF ;
    public final EObject entryRuleInsurableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsurableObject = null;


        try {
            // InternalISCL.g:809:56: (iv_ruleInsurableObject= ruleInsurableObject EOF )
            // InternalISCL.g:810:2: iv_ruleInsurableObject= ruleInsurableObject EOF
            {
             newCompositeNode(grammarAccess.getInsurableObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsurableObject=ruleInsurableObject();

            state._fsp--;

             current =iv_ruleInsurableObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsurableObject"


    // $ANTLR start "ruleInsurableObject"
    // InternalISCL.g:816:1: ruleInsurableObject returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )? ) ;
    public final EObject ruleInsurableObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalISCL.g:822:2: ( (otherlv_0= 'object' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )? ) )
            // InternalISCL.g:823:2: (otherlv_0= 'object' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )? )
            {
            // InternalISCL.g:823:2: (otherlv_0= 'object' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )? )
            // InternalISCL.g:824:3: otherlv_0= 'object' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsurableObjectAccess().getObjectKeyword_0());
            		
            // InternalISCL.g:828:3: ( (lv_name_1_0= ruleEString ) )
            // InternalISCL.g:829:4: (lv_name_1_0= ruleEString )
            {
            // InternalISCL.g:829:4: (lv_name_1_0= ruleEString )
            // InternalISCL.g:830:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInsurableObjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsurableObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.ISCL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalISCL.g:847:3: (otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalISCL.g:848:4: otherlv_2= 'owned by' ( (otherlv_3= RULE_ADDRESS ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getInsurableObjectAccess().getOwnedByKeyword_2_0());
                    			
                    // InternalISCL.g:852:4: ( (otherlv_3= RULE_ADDRESS ) )
                    // InternalISCL.g:853:5: (otherlv_3= RULE_ADDRESS )
                    {
                    // InternalISCL.g:853:5: (otherlv_3= RULE_ADDRESS )
                    // InternalISCL.g:854:6: otherlv_3= RULE_ADDRESS
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsurableObjectRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ADDRESS,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getInsurableObjectAccess().getOwnerCustomerCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsurableObject"


    // $ANTLR start "entryRuleREAL"
    // InternalISCL.g:870:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalISCL.g:872:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalISCL.g:873:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalISCL.g:882:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalISCL.g:889:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalISCL.g:890:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalISCL.g:890:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalISCL.g:891:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalISCL.g:891:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalISCL.g:892:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleEString"
    // InternalISCL.g:919:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalISCL.g:919:47: (iv_ruleEString= ruleEString EOF )
            // InternalISCL.g:920:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalISCL.g:926:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalISCL.g:932:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalISCL.g:933:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalISCL.g:933:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalISCL.g:934:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalISCL.g:942:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleContractType"
    // InternalISCL.g:953:1: ruleContractType returns [Enumerator current=null] : ( (enumLiteral_0= 'personal' ) | (enumLiteral_1= 'pool' ) | (enumLiteral_2= 'family' ) ) ;
    public final Enumerator ruleContractType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalISCL.g:959:2: ( ( (enumLiteral_0= 'personal' ) | (enumLiteral_1= 'pool' ) | (enumLiteral_2= 'family' ) ) )
            // InternalISCL.g:960:2: ( (enumLiteral_0= 'personal' ) | (enumLiteral_1= 'pool' ) | (enumLiteral_2= 'family' ) )
            {
            // InternalISCL.g:960:2: ( (enumLiteral_0= 'personal' ) | (enumLiteral_1= 'pool' ) | (enumLiteral_2= 'family' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalISCL.g:961:3: (enumLiteral_0= 'personal' )
                    {
                    // InternalISCL.g:961:3: (enumLiteral_0= 'personal' )
                    // InternalISCL.g:962:4: enumLiteral_0= 'personal'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getContractTypeAccess().getPersonalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContractTypeAccess().getPersonalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalISCL.g:969:3: (enumLiteral_1= 'pool' )
                    {
                    // InternalISCL.g:969:3: (enumLiteral_1= 'pool' )
                    // InternalISCL.g:970:4: enumLiteral_1= 'pool'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getContractTypeAccess().getPoolEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContractTypeAccess().getPoolEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalISCL.g:977:3: (enumLiteral_2= 'family' )
                    {
                    // InternalISCL.g:977:3: (enumLiteral_2= 'family' )
                    // InternalISCL.g:978:4: enumLiteral_2= 'family'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getContractTypeAccess().getFamilyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getContractTypeAccess().getFamilyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractType"


    // $ANTLR start "ruleCoverage"
    // InternalISCL.g:988:1: ruleCoverage returns [Enumerator current=null] : ( (enumLiteral_0= 'beneficiary' ) | (enumLiteral_1= 'owner' ) ) ;
    public final Enumerator ruleCoverage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalISCL.g:994:2: ( ( (enumLiteral_0= 'beneficiary' ) | (enumLiteral_1= 'owner' ) ) )
            // InternalISCL.g:995:2: ( (enumLiteral_0= 'beneficiary' ) | (enumLiteral_1= 'owner' ) )
            {
            // InternalISCL.g:995:2: ( (enumLiteral_0= 'beneficiary' ) | (enumLiteral_1= 'owner' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            else if ( (LA13_0==43) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalISCL.g:996:3: (enumLiteral_0= 'beneficiary' )
                    {
                    // InternalISCL.g:996:3: (enumLiteral_0= 'beneficiary' )
                    // InternalISCL.g:997:4: enumLiteral_0= 'beneficiary'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCoverageAccess().getBeneficiaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoverageAccess().getBeneficiaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalISCL.g:1004:3: (enumLiteral_1= 'owner' )
                    {
                    // InternalISCL.g:1004:3: (enumLiteral_1= 'owner' )
                    // InternalISCL.g:1005:4: enumLiteral_1= 'owner'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCoverageAccess().getOwnerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCoverageAccess().getOwnerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoverage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});

}