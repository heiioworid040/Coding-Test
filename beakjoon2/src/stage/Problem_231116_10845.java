package stage;

import java.io.*;
import java.util.*;

public class Problem_231116_10845 {
	private static final String PUSH_COMMAND = "push";
	private static final String POP_COMMAND = "pop";
	private static final String SIZE_COMMAND = "size";
	private static final String EMPTY_COMMAND = "empty";
	private static final String FRONT_COMMAND = "front";
	private static final String BACK_COMMAND = "back";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수
		int commandCount = Integer.parseInt(br.readLine());
		// 정수를 저장할 큐
		Queue<Integer> q = new LinkedList<>();
		
		while(commandCount-- > 0) {
			String command = br.readLine();
			
			// push 명령이라면
			if(command.startsWith(PUSH_COMMAND)) {
				pushCommand(q, command);
			// 아니라면
			}else {
				sb.append(anotherCommand(q, command)).append("\n");
			}
		}
		
		// 출력
		System.out.println(sb);
	}
	
	// push 명령을 처리하는 메서드
	public static void pushCommand(Queue<Integer> q, String command) {
		int inputNumber = Integer.parseInt(command.substring(PUSH_COMMAND.length() + 1));
		q.offer(inputNumber);
	}
	
	// push 명령을 제외한 나머지 명령을 처리하고, 출력할 정수를 반환하는 메서드
	public static int anotherCommand(Queue<Integer> q, String command) {
		switch(command) {
			case EMPTY_COMMAND:
				return q.isEmpty() ? 1 : 0;
			case SIZE_COMMAND:
				return q.size();
			case POP_COMMAND:
				return q.isEmpty() ? -1 : q.poll();
			case FRONT_COMMAND:
				return q.isEmpty() ? -1 : q.peek();
			case BACK_COMMAND:
				return q.isEmpty() ? -1 : ((LinkedList<Integer>) q).peekLast();
			default:
				return -1;
		}
	}
}
