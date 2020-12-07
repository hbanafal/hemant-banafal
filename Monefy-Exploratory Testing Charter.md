# Monefy

Monefy is a money management app where you can add your expenses in a dedicated category and 
track your spendings. You can review your expenses in detailed charts.

## Exploratory Test Charter

Please find the testing charters below arranged in the sequence based on the priority and severity. Priority and severity of the testing charter is decided by the business critical cases. Testing charters below doesn't include testing of features which are only available in the Monefy Pro app.  

Before writing these testing charter, App is explored and tried to understand the purpose of developing the app and different features as a user point of view.

**Duration** Overall time taken to perform this exploratory testing session is around 2hrs. 

**Issues** No major issues found except issues flagged in Test Charter 12. 



## Test Charter 1

**Explore** *Add Income functionality in existing category*
**With** *valid amount i.e. 5000$ and invalid amount i.e. -5000$*
**To Discover** *whether user is able to add income with valid amount and behavior of the app with invalid amount*
**Test Step** - 1. Click on income button on Home screen. 
                          2. Add valid/invalid amount and choose existing category
                          3. Check income on the Home screen
**Conclusion** - User is able to add valid income and it is appearing on the home screen and in detailed transaction report. And user is not able to proceed with invalid amount like -5000. 

## Test Charter 3

**Explore** *Add Expense functionality in existing category*
**With** *valid and invalid amount*
**To Discover** *whether user is able to add expense in existing category with valid amount and behavior of the app with invalid amount*
**Test Step** - 1. Click on expense button on Home screen. 
                          2. Add valid/invalid amount and choose existing category
                          3. Check expense and balance on the Home screen
**Conclusion** - User is able to add valid expense and expense and balance(income - expense)  is appearing on the home screen and in detailed transaction report. And user is not able to proceed with invalid amount like -5000. 

## Test Charter 4

**Explore** *Detailed transaction report*
**With** *valid expense and income amounts*
**To Discover** *whether user is able to the transaction details of his/her income and expenses in the detailed report*
**Test Step** - 1. Click on balance button (or hamburger lines on both side of balance button) on Home screen. 
                          2. Check the expenses and income added
**Conclusion** - User is able to see  detailed report containing all the expenses and incomes. 

## Test Charter 5

**Explore** *Home screen*
**With** *adding valid expenses*
**To Discover** *whether user is able to see the pie graph and able to add expense by clicking on any icon of expense category on the home screen*
**Test Step** - 1. Click on any expense category icon on Home screen. 
                          2. Add valid/invalid amount
                          3. Check expense and pie graph on the Home screen
**Conclusion** - User is able to add expense by clicking on icon on home screen and dont need to add the category while adding the expense. User is able to see the correct piegraph of his/her expense percentage wise.

## Test Charter 6

**Explore** *Top left Döner menu*
**With** *different accounts*
**To Discover** *whether user is able to filter the expense and income based on different account like cash or payment card. etc*
**Test Step** - 1. Click on Döner menu on Top left corner on Home screen. 
                          2. Click on All account  drop down menu.
                          3. Check different account and try to  select specific account             type.
**Conclusion** - User is able to filter the expense-income report based on the account type by selecting the particular account.

## Test Charter 7

**Explore** *Time interval in Top left Döner menu*
**With** *different time intervals*
**To Discover** *whether user is able to set different time intervals like monthly, yearly for income-expense report*
**Test Step** - 1. Click on Döner menu on Top left corner on Home screen. 
                          2. Change the time interval category to weekly. 
**Conclusion** - User is able to add select time interval for his expense-income tracking. For e.g. if user is on a vacation of 1 week. 

## Test Charter 8

**Explore** *Search feature*
**With** *different search strings*
**To Discover** *whether user is able to search expense or income records by searching string in notes or category or dates.*
**Test Step** - 1. Click on Search button on Home screen. 
                          2. Search any expense or income added before by using category or note text. 
**Conclusion** - User is able to search specific records by searching the text in category or in notes.

## Test Charter 9

**Explore** *Transfer feature*
**With** *different amounts*
**To Discover** *whether user is able to transfer money from one account to another account like from cash to payment card or vice versa.*
**Test Step** - 1. Click on Transfer icon on the home screen. 
                          2. Transfer amount between different account. For eg. Payment card to cash 
**Conclusion** - User is able to transfer money between different accounts.

## Test Charter 10

**Explore** *Categories - Menu in top right Kebab menu *
**With** *different categories*
**To Discover** *whether user is able to see all the existing categories and able to add new category*
**Test Step** - 1. Click on Kebab menu in the top right corner. 
                          2. Click on categories and check all existing categories of expense and income.  
**Conclusion** - User is able to see all the existing categories of expense and income. 
**Note** - Adding new category feature is not available in Monefy Lite app. 

## Test Charter 11

**Explore** *Accounts - Menu in top right Kebab menu*
**With** *different accounts*
**To Discover** *whether user is able to all the existing accounts and able to add new account*
**Test Step** - 1. Click on Kebab menu in the top right corner. 
                          2. Click on Accounts and click on + icon 
                          3. Enter name of account, initial balance, initial balance date
                          4. Select account type and click on Add in top right corner.
**Conclusion** - User is able to new account type for income.

## Test Charter 12

**Explore** *Accounts Transfer - Kebab Menu in top right corner*
**With** *different accounts*
**To Discover** *whether user is able to make a transfer between accounts*
**Test Step** - 1. Click on Kebab menu on top right corner. 
                          2. Click on Accounts and click Transfer
                          3. Select the account for transfer and add amount 
                          4. click on Add transfer 
**Conclusion** - User is able to transfer money between accounts. 
**Issues Flagged** - Amount field is appearing on top and when user tries to enter amount then there is no going back to select account types. There is no clear indication tthat user has to select the accounts before entering the amount. 

## Test Charter 13

**Explore** *Budget Settings - Menu in top right corner*
**With** *different settings*
**To Discover** *whether user is able to add the monthly budget*
**Test Step** - 1. Click on Kebab menu on top right corner. 
                          2. Click on Settings and click on budget mode.
                          3. Enter the monthly budget. 
                          4. Add some expense which exceeds the budget.
                          5. check income and balance on home screen
**Conclusion** - User is able to specify fixed budget for the month. Budget is appearing on home screen instead of total income. And balance is calculated based on budget instead of income. 

## Test Charter 14

**Explore** *Carry Over Settings - Menu in top right corner*
**With** *different settings*
**To Discover** *whether user is able to carry over the balance of previous months*
**Test Step** - 1. Add some expenses and income for previous month.
                          2.  Click on Kebab menu on top right corner. 
                          3. Click on Settings and check carry over. 
                          4. Check piechart and balance on home screen               
**Conclusion** - User is able to carry forward the balance of previous months. Additional text will appear inside piechart. Balance is recalculated including the previous carry over. 

## Test Charter 15

**Explore** *App behaviour*
**With** *without internet*
**To Discover** *whether user is able to add the record without internet*
**Test Step** - 1. Turn off wifi and mobile data.
                          2.  Open the app.
                          3. Add income and expense.
                          4. Check on home screen               
**Conclusion** - User is able to add income and expense without internet also. 




