package dome;

import org.junit.Test;


public class PersonTest {

	@Test
	public void for2()
    {
         
        Person[] pArr = new Person[3];
        pArr[0] = new Person("zhangsan",16);
        pArr[1] = new Person("lisi",18);
         
        for(Person person:pArr)
        {
            System.out.println(person);
        }
         
    }
}
