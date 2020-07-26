package pl.bykowski.kotlinspringbootapiexample;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EluwinaControoler {

  private AtomicInteger counter = new AtomicInteger();

  @GetMapping("/eluwina")
  public Eluwina greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Eluwina(counter.incrementAndGet(), "Hello " + name);
  }


  private class Eluwina {

    private int id;
    private String message;

    public Eluwina() {
    }

    public Eluwina(int id, String message) {
      this.id = id;
      this.message = message;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }
}
