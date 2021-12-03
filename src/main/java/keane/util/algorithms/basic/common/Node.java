package keane.util.algorithms.basic.common;

/**
 * Created by  @Author Keane
 *
 * @Email yang.tengjun@opg.cn
 * @Date 2021/11/29
 * @CopyRight Oriental-Pearl
 */

public class Node {

    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public void print(){
        Node cur = this;
        while(cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }
}
