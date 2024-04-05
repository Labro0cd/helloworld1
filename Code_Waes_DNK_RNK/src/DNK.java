public class DNK {
    String dnkName; //G C A T
    char dnk_char;
    int error=0;
    String nameRNK;

    public void test_dnk() {
            for(int i = 0;i< dnkName.length();i++) {
                dnk_char = dnkName.charAt(i);
                switch (dnk_char){
                    case'G','C','A','T':
                        break;
                    default:
                    error = 1;
                }
            }
    }

    public void setName(String name){
        this.dnkName = name;
    }

    public void DNK_v_RNK(){
        char RNK[] = new char[dnkName.length()];
        for(int i = 0;i<RNK.length;i++){
            RNK[i]= dnkName.charAt(i);
        }
        System.out.print(dnkName+" => ");
        for (int i = 0;i<RNK.length;i++) {
            if (RNK[i] == 'T') {
                RNK[i] = 'U';
                System.out.print(RNK[i]);
            } else {
                System.out.print(RNK[i]);
            }
        }


    }
}
