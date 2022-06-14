public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        boolean isCapitalUseRight = false;

        /*for(int i = 0; i < myString.length();i++){

            if(Character.isUpperCase(myString.charAt(1))){
                if(!Character.isUpperCase(myString.charAt(i)))
                    isCapitalUseRight = true;
            }

        }*/

        if(myString.matches("[^a-z]*") ||
                myString.matches("^[A-Z]+[a-z]*") ||
                myString.matches("^[a-z]+$") ){
            isCapitalUseRight = true;
        }

        return isCapitalUseRight;
    }

}

