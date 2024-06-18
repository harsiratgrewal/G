# GROCERY FINDER (KROGER)
## GOAL
### **_BROADER GOAL_: The goal is to provide users with a filtering application that displays all the nearby grocery stores that have the items, selected by the user, in stock. Also providing total cost estimates and total travel times so the user can use between saving time or money.**
### **_CURRENT GOAL_: This application only integrates Kroger product inventory and filters out nearby Kroger locations.**
### **_FUTURE GOAL_: Develop an application that creates multiple shopping routes for the user to choose from. First, to ensure all desired items are included. Second, to save spending costs. Third, to save traveling time.**
#

## Application Layout

### Address Prompt
- The address prompt panel let's user select their address from a drop down list. This is acheived by using ***Address Autocomplete*** feature from the **Google Maps Platform** in **GCP**.
- Once the address is selected, the address is validated by using ***Address Validation API*** from **GCP**.
- After the address validation, Kroger location data as well as product data is fetched from _Kroger API_ and stored in _MS SQL Server_ database (implemented in Azure).


### Shopping List
- The second panel provides user to add the desired items. For this application, only Kroger items with _HIGH_ inventory are displayed.


### Store Display
- After user has selected all the items, the locations containing the items **in stock** are filtered and sorted.
- User can display the stores within certain a distance (max 50 miles) as well the sort the list by cheapest, fastest, or most efficient.



_Note: Database information and all API keys are redacted for security._
