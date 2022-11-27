
// ДЗ 1.
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


public class task_1 {
    public static void main(String[] args) {
        String json1 = "{'name':'Ivanov', 'country':'null', 'city':'Moscow', 'age':'25'}";
        String json2 = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'13'}";
        String json = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        System.out.println(where(json));
        System.out.println(where(json1));
        System.out.println(where(json2));

    }

    public static String where(String in) {

        StringBuilder temp = new StringBuilder("select * from students where");
        String re = in.substring(1, in.length() - 1).replaceAll(":", "=");
        String[] Array = re.split(",");
        for (String iterable : Array) {
            if (iterable.contains("'name'")) {
                temp.append(" "+ iterable);
            } else if (iterable.contains("'country'")){ 
                    if (iterable.contains("'null'")) {
                        continue;
                    } 
                    else {temp.append(" "+"and" + iterable);}} 
              else if (iterable.contains("'age'")) {
                if (iterable.contains("'null'")) {
                    continue;
                }
                 else {
                    temp.append(" "+"and" + iterable);
                }
            }
        }
        String result = temp.toString();
        return result;

    }
}
