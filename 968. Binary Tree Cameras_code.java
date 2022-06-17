class Solution {
    int counter = 0;
TreeNode head ;

static int STATUS_MONTITORED_BY_CHILD = 2;
static int STATUS_MONTITORED_BY_PARENT = 4;
static int STATUS_CAMERA = 1;
static int STATUS_LEAF_NODE = 3;
static int STATUS_UNMONITORED = 0;
    public int minCameraCover(TreeNode root) {
      head=root;
   traverse(root,0);
    return counter;
}

public int traverse(TreeNode node, int parentStatus) {

    if(node==null){
        return -1; 
    }
    
    int reply1 = traverse(node.left,node.val);
    int reply2 = traverse(node.right,node.val);
    
    if(node.val!=STATUS_CAMERA && reply1==-1&& reply2==-1){
        if(node==head){
            counter++;
        }
        node.val = STATUS_MONTITORED_BY_PARENT;
        return node.val;
    }else if(reply1==STATUS_MONTITORED_BY_PARENT||reply2==STATUS_MONTITORED_BY_PARENT){
        node.val = STATUS_CAMERA;
        counter++;
        return node.val;
    }
    else if(reply1==STATUS_CAMERA||reply2==STATUS_CAMERA){
        node.val = STATUS_MONTITORED_BY_CHILD;
        return node.val;
    } else if(reply1==STATUS_MONTITORED_BY_CHILD || reply2 == STATUS_MONTITORED_BY_CHILD){
        if(node==head){
            node.val = STATUS_CAMERA;
            counter++;
            return node.val;
        }
        node.val = STATUS_MONTITORED_BY_PARENT;
        return node.val;
    }
    return node.val;
}
}
