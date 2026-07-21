class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        ArrayList<Character> closingBrackets = new ArrayList();
        closingBrackets.add(')');
        closingBrackets.add('}');
        closingBrackets.add(']');
        for (char c: s.toCharArray()){
            if (!closingBrackets.contains(c)){
                st.push(c);
            }
            else{
                if(st.isEmpty())
                    return false;
                if (closingBrackets.contains(c)){
                    char peeker = st.peek();
                    if(peeker == '(' && c!=')')
                        return false;
                    if(peeker == '{' && c!='}')
                        return false;
                    if(peeker == '[' && c!=']')
                        return false;
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
