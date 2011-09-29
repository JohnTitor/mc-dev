package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet43SetExperience extends Packet {

    public int a;
    public int b;
    public int c;

    public Packet43SetExperience() {}

    public Packet43SetExperience(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
    }

    public void a(DataInputStream datainputstream) throws IOException { // CraftBukkit - add throws declaration
        this.a = datainputstream.readByte();
        this.c = datainputstream.readByte();
        this.b = datainputstream.readShort();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException { // CraftBukkit - add throws declaration
        dataoutputstream.writeByte(this.a);
        dataoutputstream.writeByte(this.c);
        dataoutputstream.writeShort(this.b);
    }

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        return 4;
    }
}
