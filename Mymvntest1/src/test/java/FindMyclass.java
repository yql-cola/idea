import com.springboot.bean.Admin;
import com.springboot.controller.AdminController;
import com.springboot.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class FindMyclass extends ApplicationTests {

    @Autowired
    private AdminController adminController;
    @Autowired
    private AdminService adminService;

    @Test

    public void findMyname(){
        String name = "admin";
        adminService.findMyname(name);
        System.out.println("ok");
    }
}
