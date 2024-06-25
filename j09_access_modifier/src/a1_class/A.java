package a1_class;

/**
 * public class는 프로젝트 내부에서 어디서나 접근 가능
 * class A(default class)는 동일한 package 내에서만 접근 가능
 * class 접근제한 public, default 2가지만 가능
 */
public class A {
	// 동일한 package 내에서 접근가능한 default class
	B b = new B();
}
