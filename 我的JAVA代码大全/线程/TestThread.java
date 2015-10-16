package testthread;

import java.io.OutputStream;

import testthread.Stack.Input;
import testthread.Stack.Output;

/*
 * ��дһ���߳�ͬ���ĳ�����һ���ַ�������������Ϊlength�����Ǵ��������̣߳�����һ���߳����ַ�������д��һ���ַ����ַ�����
 * ��һ��ֻ��װ��һ���ַ�������һ���̴߳��ַ�������ȡ��һ���ַ������������Ҫ��֤��һ���߳���д�ַ���ʱ����һ���̲߳��ܷ�
 * �ʻ��������������ַ�������Ϊ�յ�ʱ��ȡ�����ַ��������ַ�������Ϊ����ʱ����д���ַ���
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
				System.out.println("���ַ�������д���ַ���" + tmp);
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
				System.out.println("���ַ������������ַ���" + tmp);
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
