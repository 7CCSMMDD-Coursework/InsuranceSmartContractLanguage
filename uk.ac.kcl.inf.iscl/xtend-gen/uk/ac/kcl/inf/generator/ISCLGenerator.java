/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.inf.iSCL.ClaimReductionTerm;
import uk.ac.kcl.inf.iSCL.Contract;
import uk.ac.kcl.inf.iSCL.ContractCancellationTerm;
import uk.ac.kcl.inf.iSCL.ContractType;
import uk.ac.kcl.inf.iSCL.Coverage;
import uk.ac.kcl.inf.iSCL.Customer;
import uk.ac.kcl.inf.iSCL.InsurableObject;
import uk.ac.kcl.inf.iSCL.PremiumIncreaseTerm;
import uk.ac.kcl.inf.iSCL.ViolationTerm;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ISCLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Contract model = ((Contract) _head);
    fsa.generateFile(this.getTargetFileName(resource), this.doGenerate(model));
  }
  
  public String getTargetFileName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String originalFileName = resource.getURI().lastSegment();
      String _substring = originalFileName.substring(0, originalFileName.indexOf("."));
      _xblockexpression = (_substring + ".sol");
    }
    return _xblockexpression;
  }
  
  public String doGenerate(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// SPDX-License-Identifier: GPL-3.0");
    _builder.newLine();
    _builder.append("pragma solidity >=0.7.0 <0.9.0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    String _name = contract.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final String companyAddress = contract.getCompany().getName();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final EList<InsurableObject> insurableObjects = contract.getInsurableObjects();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final float premium = contract.getPaymentTerm().getPremium();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final int premiumIncrease = contract.getPaymentTerm().getIncrease();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final float claim = contract.getClaimTerm().getClaim();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final int paymentPeriod = contract.getPaymentTerm().getPeriod();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _participants = this.getParticipants(contract);
    _builder.append(_participants, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("address payable company = payable(");
    _builder.append(companyAddress, "\t");
    _builder.append(");\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("uint256 private paymentPeriod = ");
    _builder.append(paymentPeriod, "\t");
    _builder.append(" days;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uint256 private premiumIncrease = ");
    _builder.append(premiumIncrease, "\t");
    _builder.append(";\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uint256 private claimAmount = ");
    _builder.append(claim, "\t");
    _builder.append(" ether;\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uint256 private premiumAmount = ");
    _builder.append(premium, "\t");
    _builder.append(" ether;\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uint256 private lastPayment;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("uint256 public numClaims;\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("enum ContractState { ACTIVE, INACTIVE, BLOCKED }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ContractState public contractState;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateConstructor = this.generateConstructor(contract);
    _builder.append(_generateConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generatePremiumPaymentFunction = this.generatePremiumPaymentFunction(contract);
    _builder.append(_generatePremiumPaymentFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateClaimFunction = this.generateClaimFunction(contract);
    _builder.append(_generateClaimFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _equals = ContractType.POOL.equals(contract.getType());
      if (_equals) {
        _builder.append("\t");
        String _generateGetPremiumPool = this.generateGetPremiumPool();
        _builder.append(_generateGetPremiumPool, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _generateGetTotalPremium = this.generateGetTotalPremium();
        _builder.append(_generateGetTotalPremium, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _generateGetPremium = this.generateGetPremium();
        _builder.append(_generateGetPremium, "\t");
        _builder.append("\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateGetClaim = this.generateGetClaim();
    _builder.append(_generateGetClaim, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getParticipants(final Contract contract) {
    final ContractType contractType = contract.getType();
    String result = "";
    boolean _equals = ContractType.PERSONAL.equals(contractType);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("address payable customer = payable(");
      String _name = contract.getCustomers().get(0).getName();
      _builder.append(_name);
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      result = _builder.toString();
    }
    boolean _equals_1 = ContractType.FAMILY.equals(contractType);
    if (_equals_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("address payable owner = payable(");
      String _name_1 = contract.getCustomers().get(0).getName();
      _builder_1.append(_name_1);
      _builder_1.append(");\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("address payable[] beneficiaries;");
      _builder_1.newLine();
      result = _builder_1.toString();
    }
    boolean _equals_2 = ContractType.POOL.equals(contractType);
    if (_equals_2) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("address payable[] customers;\t\t\t    ");
      _builder_2.newLine();
      _builder_2.append("mapping(address => uint256) private participations;");
      _builder_2.newLine();
      _builder_2.append("uint256 private totalPremiumReleased;");
      _builder_2.newLine();
      result = _builder_2.toString();
    }
    return result;
  }
  
  protected String _handleViolationTerms(final ContractCancellationTerm violationTerm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("if(lastPayment + paymentPeriod < block.timestamp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("contractState = ContractState.BLOCKED;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.append("\n\n", "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("require(contractState != ContractState.BLOCKED, \"The contract has been blocked due to late payment.\");");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _handleViolationTerms(final ClaimReductionTerm violationTerm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("if(lastPayment + paymentPeriod < block.timestamp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("claimAmount = claimAmount * (100 - ");
    int _claimReduction = violationTerm.getClaimReduction();
    _builder.append(_claimReduction, "\t\t");
    _builder.append(")/100;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.append("\n\n", "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _handleViolationTerms(final PremiumIncreaseTerm violationTerm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("if(lastPayment + paymentPeriod < block.timestamp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("premiumAmount = premiumAmount * (100 + ");
    int _premiumIncrease = violationTerm.getPremiumIncrease();
    _builder.append(_premiumIncrease, "\t\t");
    _builder.append(")/100;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.append("\n\n", "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateConstructor(final Contract contract) {
    final String signature_start = "constructor() {\n\n";
    final String signature_end = "\n}\n";
    String _switchResult = null;
    ContractType _type = contract.getType();
    if (_type != null) {
      switch (_type) {
        case PERSONAL:
          _switchResult = this.getContructorPersonal(contract);
          break;
        case FAMILY:
          _switchResult = this.getContructorFamily(contract);
          break;
        case POOL:
          _switchResult = this.getContructorPool(contract);
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    String body = _switchResult;
    return signature_start.concat(body).concat(signature_end);
  }
  
  public String generatePremiumPaymentFunction(final Contract contract) {
    final String signature_start = "function pay() public payable {\n\n";
    final String signature_end = "\n}\n";
    final Function1<ViolationTerm, String> _function = (ViolationTerm it) -> {
      return this.handleViolationTerms(it);
    };
    final String violationTerms = IterableExtensions.join(ListExtensions.<ViolationTerm, String>map(contract.getViolationTerms(), _function), "\n");
    String _switchResult = null;
    ContractType _type = contract.getType();
    if (_type != null) {
      switch (_type) {
        case PERSONAL:
          _switchResult = this.generatePremiumFunctionPersonal(contract);
          break;
        case FAMILY:
          _switchResult = this.generatePremiumFunctionFamily(contract);
          break;
        case POOL:
          _switchResult = this.generatePremiumFunctionPool(contract);
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    String body = _switchResult;
    return signature_start.concat(violationTerms).concat(body).concat(signature_end);
  }
  
  public String generateClaimFunction(final Contract contract) {
    final String signature_start = "function claim() public payable {\n\n";
    final String signature_end = "\n}\n";
    String _switchResult = null;
    ContractType _type = contract.getType();
    if (_type != null) {
      switch (_type) {
        case PERSONAL:
          _switchResult = this.generateClaimFunctionPersonal(contract);
          break;
        case FAMILY:
          _switchResult = this.generateClaimFunctionFamily(contract);
          break;
        case POOL:
          _switchResult = this.generateClaimFunctionPool(contract);
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    String body = _switchResult;
    return signature_start.concat(body).concat(signature_end);
  }
  
  public String getContructorPersonal(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("numClaims = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("lastPayment = block.timestamp;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("contractState = ContractState.INACTIVE;\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String getContructorFamily(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("numClaims = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("lastPayment = block.timestamp;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("contractState = ContractState.INACTIVE;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      final Function1<Customer, Boolean> _function = (Customer it) -> {
        return Boolean.valueOf(it.getCoverage().equals(Coverage.BENEFICIARY));
      };
      Iterable<Customer> _filter = IterableExtensions.<Customer>filter(contract.getCustomers(), _function);
      for(final Customer customer : _filter) {
        _builder.append("    ");
        _builder.append("beneficiaries.push(payable(");
        String _name = customer.getName();
        _builder.append(_name);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    String result = _builder.toString();
    return result;
  }
  
  public String getContructorPool(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("numClaims = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("totalPremiumReleased = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("lastPayment = block.timestamp;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("contractState = ContractState.INACTIVE;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      int _size = contract.getCustomers().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for(final Integer i : _doubleDotLessThan) {
        _builder.append("    ");
        _builder.append("customers.push(payable(");
        String _name = contract.getCustomers().get((i).intValue()).getName();
        _builder.append(_name);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("participations[customers[");
        _builder.append(i);
        _builder.append("]] = ");
        int _participation = contract.getCustomers().get((i).intValue()).getParticipation();
        _builder.append(_participation);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    String result = _builder.toString();
    return result;
  }
  
  public String generateRequirement(final String left, final String operator, final String right, final String error_message) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("require(");
    _builder.append(left);
    _builder.append(" ");
    _builder.append(operator);
    _builder.append(" ");
    _builder.append(right);
    _builder.append(", \"");
    _builder.append(error_message);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateTransfer(final String address, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append(address);
    _builder.append(".transfer(");
    _builder.append(value);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String statementActivateContract() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("contractState = ContractState.ACTIVE;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePremiumFunctionPersonal(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("msg.sender", "==", "customer", "Only the contract owner can pay");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateTransfer = this.generateTransfer("company", "msg.value");
    _builder.append(_generateTransfer);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _statementActivateContract = this.statementActivateContract();
    _builder.append(_statementActivateContract);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("lastPayment = block.timestamp;\t\t\t\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePremiumFunctionFamily(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("msg.sender", "==", "owner", "Only the contract owner can pay");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateTransfer = this.generateTransfer("company", "msg.value");
    _builder.append(_generateTransfer);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _statementActivateContract = this.statementActivateContract();
    _builder.append(_statementActivateContract);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("lastPayment = block.timestamp;\t\t\t\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePremiumFunctionPool(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("participations[msg.sender]", ">", "0", "This address is not a contract participant");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("totalPremiumReleased += msg.value;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if(totalPremiumReleased == getTotalPremium()){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateTransfer = this.generateTransfer("company", "totalPremiumReleased");
    _builder.append(_generateTransfer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _statementActivateContract = this.statementActivateContract();
    _builder.append(_statementActivateContract, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("lastPayment = block.timestamp;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("totalPremiumReleased = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateClaimFunctionPersonal(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_2 = this.generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount");
    _builder.append(_generateRequirement_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateTransfer = this.generateTransfer("customer", "claimAmount");
    _builder.append(_generateTransfer);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("numClaims++;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateClaimFunctionFamily(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_2 = this.generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount");
    _builder.append(_generateRequirement_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (uint i = 0; i < beneficiaries.length; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateTransfer = this.generateTransfer("beneficiaries[i]", "claimAmount / beneficiaries.length");
    _builder.append(_generateTransfer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("numClaims++;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateClaimFunctionPool(final Contract contract) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateRequirement = this.generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_1 = this.generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer");
    _builder.append(_generateRequirement_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateRequirement_2 = this.generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount");
    _builder.append(_generateRequirement_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (uint i = 0; i < customers.length; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("address payable customer = customers[i];");
    _builder.newLine();
    _builder.append("\t");
    String _generateTransfer = this.generateTransfer("customer", "claimAmount * participations[customer]/100");
    _builder.append(_generateTransfer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("numClaims++;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateGetPremium() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function getPremium() public view returns (uint256 premium) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateGetClaim() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function getClaim() public view returns (uint256 the_claim) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return claimAmount;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateGetTotalPremium() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function getTotalPremium() private view returns (uint256 premium) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateGetPremiumPool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function getPremium() public view returns (uint256 premium) {");
    _builder.newLine();
    String _generateRequirement = this.generateRequirement("participations[msg.sender]", ">", "0", "This address is not a contract participant");
    _builder.append(_generateRequirement);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return getTotalPremium() * participations[msg.sender]/100;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String handleViolationTerms(final ViolationTerm violationTerm) {
    if (violationTerm instanceof ClaimReductionTerm) {
      return _handleViolationTerms((ClaimReductionTerm)violationTerm);
    } else if (violationTerm instanceof ContractCancellationTerm) {
      return _handleViolationTerms((ContractCancellationTerm)violationTerm);
    } else if (violationTerm instanceof PremiumIncreaseTerm) {
      return _handleViolationTerms((PremiumIncreaseTerm)violationTerm);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(violationTerm).toString());
    }
  }
}
