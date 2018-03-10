package redis;

import redis.clients.jedis.Jedis;

public class Example {

	Jedis jedis;

	public Example(Jedis jedis) {
		this.jedis = jedis;
		System.out.println("Crée");
	}


	public void example1(){
		jedis.set("foo", "bar");
        String value = jedis.get("foo");

        System.err.println(value);
        System.out.println( "Hello World!" );
	}


	public void example2(){
		System.out.println(jedis.get("counter"));
        jedis.incr("counter");
        System.out.println(jedis.get("counter"));



	}


	public void example3() throws InterruptedException{
		String cacheKey = "cachekey";
        // adding a new key
        jedis.set(cacheKey, "cached value");
        // setting the TTL in seconds
        jedis.expire(cacheKey, 15);
        //jedis.expire(key, seconds)
        // Getting the remaining ttl
        System.out.println("TTL:" + jedis.ttl(cacheKey));
        Thread.sleep(1000);
        System.out.println("TTL:" + jedis.ttl(cacheKey));
        // Getting the cache value
        System.out.println("Cached Value:" + jedis.get(cacheKey));

        // Wait for the TTL finishs
        Thread.sleep(15000);

        // trying to get the expired key
        System.out.println("Expired Key:" + jedis.get(cacheKey));

	}


	public void example4(){
		String cacheKey = "languages";
        // Adding a set as value

        jedis.sadd(cacheKey, "Java");
        jedis.sadd(cacheKey, "C#");
        jedis.sadd(cacheKey, "Python");// SADD

        // Getting all values in the set: SMEMBERS
        System.out.println("Languages: " + jedis.smembers(cacheKey));
        // Adding new values
        jedis.sadd(cacheKey, "Java");
        jedis.sadd(cacheKey, "Ruby");
        // Getting the values... it doesn't allow duplicates
        System.out.println("Languages: " + jedis.smembers(cacheKey));

	}







}
