public class RNK {
    private String rnkName; //G C A T
    char rnk_char;
    int error=0;

    public int test_name(){
        return rnkName.length();
    }

    public void test_rnk() {
        for(int i = 0;i< rnkName.length();i++) {
            rnk_char = rnkName.charAt(i);
            switch (rnk_char){
                case'G','C','A','U':
                    break;
                default:
                    error = 1;
            }
        }
    }

    public void setName(String name){
        this.rnkName = name;
    }
}
