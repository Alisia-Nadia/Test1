/**
 * Created by caoth on 2/22/2017.
 */
public class personinfo {


    public personinfo(String name, double age) {
        this.name = name;
        this.age = age;
    }

    String name;   //comment by me(ers), is this change visible
        double age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }


}
