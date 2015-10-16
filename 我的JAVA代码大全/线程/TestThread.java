package testthread;

import java.io.OutputStream;

import testthread.Stack.Input;
import testthread.Stack.Output;

/*
 * 编写一个线程同步的程序：有一个字符缓冲区，长度为length，我们创建两个线程，其中一个线程想字符缓冲区写如一个字符（字符缓冲
 * 区一次只能装如一个字符），另一个线程从字符缓冲区取出一个字符，并且输出，要保证当一个线程在写字符的时候，另一个线程不能访
 * 问缓冲区，并且在字符缓冲区为空的时候取不出字符，而且字符缓冲区为慢的时候不能写入字符；
 */
class Stack{
	private int length;
	private char [] stack = new char[length+1];
	private int num  = 0 ;
	public synchronized void wriet(char c ){
		int length = 0;
		while(num == length){
			 try{
				 this.wait();
			 }catch(InterruptedException e){
				 
			 }
			 num++;
			 stack[num] = c;
			 this.notify();	
		}
	}
	
	
	public synchronized char read(){
		while(num == 0){
			 try{
				 this.wait();
			 }catch(InterruptedException e){
				 
			 }
			 num--;
			 this.notify();		
		}
		 return stack[num+1];
	}
	
	
	class Input implements Runnable{
		Stack sstack;
		public Input(Stack s){
			sstack = s;
		}
		
		public void run(){
			for(int i = 1; i<10; i++){
				char tmp;
				tmp=(char)(96+i);
				sstack.wriet(tmp);
				System.out.println("向字符缓冲区写入字符：" + tmp);
				try{
					Thread.sleep((int)(Math.random()*10));
				}catch(InterruptedException e){}
			}
		}
	}
	
	class Output implements Runnable{
		Stack sstack;
		public Output(Stack s){
			sstack = s;
		}
		
		public void run(){
			char tmp;
			for(int i = 1; i<10; i++){
				tmp = sstack.read();
				System.out.println("向字符缓冲区读出字符：" + tmp);
				try{
					Thread.sleep((int)(Math.random()*10));
				}catch(InterruptedException e){}
			}
		}
	}		
}


public class TestThread {
	public static void main(String[] args){
		Stack s = new Stack();
//		Input t = new Input(s);
//		Output o = new OutputStream(s);
//		Thread t1 = new Thread(t);
//		Thread t2 = new Thread(o);
//		t1.start();
//		t2.start();
	}
	
}
