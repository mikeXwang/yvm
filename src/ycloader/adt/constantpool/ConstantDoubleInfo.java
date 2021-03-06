package ycloader.adt.constantpool;

import ycloader.ClassFileReader;
import ycloader.adt.u1;
import ycloader.adt.u4;
import ycloader.constant.ConstantPoolTags;

import java.io.IOException;

public class ConstantDoubleInfo extends AbstractConstantPool {
    public static final u1 tag = new u1(ConstantPoolTags.CONSTANT_Double);
    public u4 highBytes;
    public u4 lowBytes;

    public ConstantDoubleInfo(ClassFileReader reader) {
        super(reader);
    }

    @Override
    public void stuffing() throws IOException {
        highBytes = read4Bytes();
        lowBytes = read4Bytes();
    }
}
