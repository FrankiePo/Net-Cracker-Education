package com.netcracker.edu.java.tasks;

import java.util.Iterator;

/**
 * Created by Frankie Po on 11.07.2015.
 */
public class TreeNodeImpl implements TreeNode {
    TreeNode parent;
    TreeNode root;
    boolean expanded;

    @Override
    public TreeNode getParent() {
        return parent;
    }

    @Override
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public Iterator<TreeNode> getChildrenIterator() {
        return null;
    }

    @Override
    public void addChild(TreeNode child) {

    }

    @Override
    public boolean removeChild(TreeNode child) {
        return false;
    }

    @Override
    public boolean isExpanded() {
        return false;
    }

    @Override
    public void setExpanded(boolean expanded) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void setData(Object data) {

    }

    @Override
    public String getTreePath() {
        return null;
    }

    @Override
    public TreeNode findParent(Object data) {
        return null;
    }

    @Override
    public TreeNode findChild(Object data) {
        return null;
    }
}
