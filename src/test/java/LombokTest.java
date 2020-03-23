import org.junit.Assert;
import org.junit.Test;
import pojo.DataPojo;
import pojo.GetterSetterPojo;

public class LombokTest {
    @Test
    public void getterSetterTest() {
        //@Data
        DataPojo dataPojo = new DataPojo();
        dataPojo.setName("nero");
        Assert.assertEquals("nero", dataPojo.getName());

        //@Getter Setter
        GetterSetterPojo getterSetterPojo = new GetterSetterPojo();
        getterSetterPojo.setAge(1);
        Assert.assertEquals(1, getterSetterPojo.getAge());
    }
}
