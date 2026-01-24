class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < identifier.length(); i++){
            char part = identifier.charAt(i);

            if(part == ' '){
                sb.append('_');
            }else if(part == '-'){
                i++;
                char next = identifier.charAt(i);
                sb.append(Character.toUpperCase(next));
            }else if(Character.isDigit(part)){
                switch(part){
                    case '0':
                        sb.append('o');
                        break;
                    case '1':
                        sb.append('l');
                        break;
                    case '3':
                        sb.append('e');
                        break;
                    case '4':
                        sb.append('a');
                        break;
                    case '7':
                        sb.append('t');
                        break;
                }
            }else if(Character.isLetter(part)){
                sb.append(part);
            }
        }

        return sb.toString();
    } 
}
