package com.ylkget.pattern.principle.inversion;

/**
 * <p>
 * DependencyPass 依赖传递的三种方式
 * </p>
 *
 * @author joe 2021/3/26 14:49
 */
public class DependencyPass {
    public static void main(String[] args) {
        // 方式1：通过接口传递实现依赖 执行
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new Dell());

        // 方式2：通过构造函数实现依赖 执行
        OpenAndClose openAndClose = new OpenAndClose(new ChangHong());
        openAndClose.open();

        // 方式3：通过Set方法依赖传递 执行
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.setTv(new Dell());
//        openAndClose.open();
    }

    // 方式1：通过接口传递实现依赖
//    static class OpenAndClose implements IOpenAndClose {
//        @Override
//        public void open(ITV tv) {
//            tv.play();
//        }
//    }
//    interface IOpenAndClose {
//        void open(ITV tv);
//    }

    // 方式2：通过构造函数实现依赖
    static class OpenAndClose implements IOpenAndClose {
        public ITV itv;

        public OpenAndClose(ITV itv) {
            this.itv = itv;
        }

        @Override
        public void open() {
            itv.play();
        }
    }
    interface IOpenAndClose {
        void open();
    }

    // 方式3：通过Set方法依赖传递
//    static class OpenAndClose implements IOpenAndClose {
//        public ITV itv;
//        @Override
//        public void open() {
//            itv.play();
//        }
//
//        @Override
//        public void setTv(ITV itv) {
//            this.itv = itv;
//        }
//    }
//    interface IOpenAndClose {
//        void open();
//        void setTv(ITV itv);
//    }

    // ================== common

    static class Dell implements ITV {
        @Override
        public void play() {
            System.out.println("Dell play!");
        }
    }

    static class ChangHong implements ITV {
        @Override
        public void play() {
            System.out.println("ChangHong play!");
        }
    }

    interface ITV {
        void play();
    }
}
