package redis;

import redis.clients.jedis.Jedis;

public class TestRedis {
	public static void main(String[] args) {
		 //连接本地的 Redis 服务
	      Jedis jedis = new Jedis("192.168.211.15",6379);
	      //jedis.auth("123456");
	      System.out.println("Connection to server sucessfully");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	      String value = jedis.get("RK_USER_LOGIN_TOKEN_PRE_20180418142053137990");
	      value.getBytes();
	      System.out.println(jedis.get("RK_USER_LOGIN_TOKEN_PRE_20180418142053137990"));
	      /*jedis.set("foo", "bar");  
	      String value = jedis.get("foo");  
	      System.out.println(value);  */
	}
}
