package qqqqqqqqqqq;

import redis.clients.jedis.Jedis;
public class first {

	public static void main(String[] args) {
		/*	System.out.println("what fack");
			System.out.println("tell me why???");
			你是谁？？
			System.out.println("666666");
			System.out.println("666666");*/
			
			Jedis redis =new Jedis("localhost",6379);
			redis.set("userName", "666666");
			System.out.println(redis.get("userName"));
			redis.close();
			
	}

}
 
