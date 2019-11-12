class BasicCalculator {
    public static int calculate(String s) {
        
        String reduced = s.replaceAll("\\s","");
        System.out.println(reduced);
        if (reduced.length() == 3)
        {   
            if (reduced.contains("+"))
            {
                String oper[] = reduced.split("\\+");                
                return new Integer(oper[0]) + new Integer(oper[1]);
            }
            else 
            {
                String oper[] = reduced.split("\\-");
                return new Integer(oper[0]) - new Integer(oper[1]);
            }
        }
        else{
            String [0] and           if - calculate (rest)
            String [0] and String[1] if - calculate(rest)
        } 
        
        return 1;
    }

    public static void main (String[] args){
        System.out.println (calculate("2 - 4"));
    }
}