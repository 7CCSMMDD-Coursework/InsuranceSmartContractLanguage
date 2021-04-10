# Insurance Smart Contract Language 📃

By

Christos Plaskasovitis

Horia Tudor Pavel Simon

## Language overview

The Insurance Smart Contract Language allows for easily creating smart contracts, abstracting coding details while also maintaining a comprehensive syntax. The abstracted language is Solidity, an object-oriented programming interface for creating smart contracts on the Ethereum network.

There are three types of smart contracts enforced by ISCL:

* Personal 🙍‍♂️ 
* Family 👪
* Pool (shared) 👩‍👩‍👦👨‍👨‍👧‍👧

Personal contracts are between a company and a customer. The contract insures one or more objects and the customer can claim only if the premium is paid at specified intervals of time. This is the simplest kind of contract. Premium paid takes into account previous claims, meaning that the value of a premium will increase with each claim. This applies to every contract.

Family contracts are usually between senior family members, which are stated as owners, and junior members, which figure as beneficiaries. In a family contract, only the owner (only one owner) pays the premium, and only the beneficiaries can claim. The claim is split equally among the beneficiaries.

Pool contracts bring a more complex approach to the table. All the members of these contracts are owners of the insurable object(s). This contract must specify a participation percentage (integer) for each of the owners. The premium and the claim are both calculated proportionally with this participation factor. The claim can only be requested if each party has paid its part of the premium.

The following section will contain instructions on how to set up the environment for using ISCL. After that, guidance on the how to run the projects will be given, followed by a functionality overview of the generated code in an online IDE.

## Environment setup

The environment required for running this project is Eclipse IDE. Additional modelling and plug-in support is required. For further reference on the dependencies needed refer to the following [page](https://techwiki.nms.kcl.ac.uk/doku.php?do=login&id=deptsoftlists:informatics:7ccsmmdd:start) (King's internal credentials required).

Note that Java 8 or above is required to run this project.

Keep in mind that some of the above folder projects are intended to live in the base Eclipse environment while others are created for Runtime Eclipse. The following list displays this separation:

Eclipse (Xtext projects providing grammar, validations and generator):

* uk.ac.kcl.inf.iscl ✅
* uk.ac.kcl.inf.iscl.ide ✅
* uk.ac.kcl.inf.iscl.tests ✅
* uk.ac.kcl.inf.iscl.ui ✅
* uk.ac.kcl.inf.iscl.ui.tests ✅

Runtime Eclipse:

* uk.ac.kcl.inf.iscl.runtime (providing sample .iscl files with corresponding generated code) ✅
* uk.ac.kcl.inf.iscl.xpect (tests for the language) ✅

## Running the project

Once the dependencies are installed, clone this repository in a Eclipse workspace.

1. Go to `uk.ac.kcl.inf.iscl.src` and open `ISCL.xtext`.
2. Right-click anywhere on the file and choose `Run As > Generate Xtext Artifacts`.
3. Wait until the artifacts are generated and then launch Runtime Eclipse by right-clicking on the `uk.ac.kcl.inf.iscl` project and choosing `Run As > Eclipse Application`.
4. In Runtime Eclipse import the two projects from above `uk.ac.kcl.inf.iscl.runtime` and `uk.ac.kcl.inf.iscl.xpect`.
5. Sample contracts can already be found in the `src` folder of the `uk.ac.kcl.inf.iscl.runtime` project.
6. To create a new smart contract through ISCL, right-click on the `src` folder of `uk.ac.kcl.inf.iscl.runtime` project and choose `New > File`.
7. The file extension for ISCL is `.iscl`.
8. Write the contract code and hit `Ctrl + S` to save it. This action will automatically create a `.sol` file and place it in the `src-gen` folder. This file will contain the generated Solidity code.


To test this code, go to the [Online Remix IDE](https://remix.ethereum.org). Deploy the contract and test the functionality.

In Remix IDE:

1. Create a new file in Remix: `Right-click > New file`.
2. Generate a `.sol` file in Runtime Eclipse.
3. Paste the code in Remix IDE.
4. Compile the code (navigate to the compiler from the panel on the right).
5. Deploy the contract.

### Sample run

Take the example of `Personal.sol` contract from `sample_smart_contracts/` folder. To test this contract copy paste the code in the newly created `.sol` file in Remix and follow the above steps to compile and deploy it. Deploy the contract from the company address (starting with 0x5B38...).

After deployment, switch to the customer (address starting with 0xAb84..).and get the premium to know how much we have to pay. Then, take the value returned by this function and add it to the `value` field and hit `pay`. After this, we need to switch to the company (starting with 0x5B38...) and get the claim. Similarly, take the value returned by the `getClaim` function and paste it in the `value` field. Click on claim to finalize the payment and pay the customer.

## Contract functionality

After the contract is deployed, the customers have a specified period of time to pay the premium (value is defined in ISCL). The premium is an amount of ether (the Ethereum currency) that needs to be paid once per the specified period. The contract allows for defining violation terms if this condition is breached (e.g., contract is blocked and customer cannot claim the insurance money).

Let's see now what are the main pieces of code that are common among all contract types (personal, family and pool).

### Constructor

The constructor initializes values like the number of claims, last payment date and the contract state. It also initializes the beneficiary/owner lists in the case of family and pool contracts.

### Pay function

The `pay()` handles the payments done from the customer to the company. This function starts by checking if any of the terms were violated (through a series of if-statements). After that, a series of `require` statements are checking for details specific to the contract type: for instance, the beneficiaries are not allowed to pay the premium in a family contract; only the owner can do it.

### Claim function

The `claim()` function regulates the transfers from the company to the customer(s). This function does not check for violation terms, but it requires some basic details: contract state to be active, the initiator of this action is the company, and the amount is the pre-defined claim amount.

### Other

Utility functions like `getPremium()` and `getClaim()` that calculate the premium and the claim and return those values. These values change and they need to be updated. The number of claims done or a violation in terms will increase the premium amount. In the case of the pool contract, these values are scaled using the participation factor.
