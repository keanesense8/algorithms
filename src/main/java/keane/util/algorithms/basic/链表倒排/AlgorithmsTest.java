package keane.util.algorithms.basic.链表倒排;

import keane.util.algorithms.basic.common.Node;
import org.junit.Test;

/**
 * Created by  @Author Keane
 *
 * @Email yang.tengjun@opg.cn
 * @Date 2021/11/29
 * @CopyRight Oriental-Pearl
 */
public class AlgorithmsTest {



    @Test
    public void main(){
//        System.out.println("a");
        Node node6 = new Node(8);
        Node node5 = new Node(2, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(7, node4);
        Node node2 = new Node(5, node3);
        Node node1 = new Node(6, node2);
        node1.print();
        Node node = reverse(node1);
        System.out.println();
        node.print();
    }

    private Node reverse(Node node1) {
        if(node1 == null || node1.next == null)
            return node1;
        Node dommyHead = new Node(-1);
        Node cur = node1;
        while(cur != null){
            Node next = cur.next;
            cur.next = dommyHead.next;
            dommyHead.next = cur;
            cur = next;
        }
        return dommyHead.next;
    }

    public void test(){
        int a[] = new int[2];
        int[] b = new int[2];
    }


}
