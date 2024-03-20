# ChildActivity
1. X declare a boolean showMessage1Child somewhere near the top of the class (similar to messageOne in MainActivity)
2. X Declare a SHOW_MESSAGE_ONE constant in ChildActivity,  similar to the TAG variable in MainActivity
3. X Use SHOW_MESSAGE_ONE in the intentFactory method in the ChildActivity when adding a boolean extra
4. X Use SHOW_MESSAGE_ONE to RETRIEVE the boolean extra and store the returned value in showMessage1Child
5. Use the value stored in showMessage1Child to set the text that is displayed on the button

## Small fix
https://gist.github.com/danielcshn/7aa57155d766d46c043fde015f054d40
