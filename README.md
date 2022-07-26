# Spring4thEdition

1. 스프링 프레임워크 소개 <br>
1.4 스프링의 장점 <br>
1.4.1 지역과 전역 트랜잭션을 일관성 있게 섞어서 사용하기 <br>
```
import java.sql.Connection;
import java.sql.SQLExeption;

public class FixedDepositService {
  public FixedDepositDetails getFixedDepositDetails(....) {....}
  
  public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
    Connection con = ....;
    try {
      con.setAutoCommit(false);
      // -- 데이터베이스 테이블을 변경하는 SQL 문을 여럿 실행한다.
      con.commit();
    } catch(SQLException sqle) {
      if(con != null) {
        con.rollback();
      }
    }
    ....
  }
}
```
createFicedDeposit 메서드가 JDBC Connection 객체를 사용해서 데이터베이스를 직접 관리한다.   <br>
JDBC Connection과 같은 자원에 따라 정해지는 트랜잭션을 지역 트랜잭션이라고 부른다.  <br>
