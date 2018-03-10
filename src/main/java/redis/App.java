package redis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
        Jedis jedis = new Jedis("localhost");
        Example example = new Example(new Jedis("localhost"));
        
        example.example1();
        System.out.println("------------------------------------------------");
        example.example2();
        System.out.println("------------------------------------------------");
        example.example3();
        System.out.println("------------------------------------------------");
        example.example4();

    }


}



