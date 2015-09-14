package com.nao20010128nao.protocol.packets;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import net.minecraft.server.v1_8_R3.NBTReadLimiter;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.PacketDataSerializer;

import com.nao20010128nao.LBPlayer;

public abstract class DataPacket implements
		net.minecraft.server.v1_8_R3.Packet<LBPlayer> {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	DataOutputStream dos = new DataOutputStream(baos);
	ByteArrayOutputStream.ByteArrayInputStream bais = baos.getInputStream();
	DataInputStream dis = new DataInputStream(bais);
	int channel = 0;

	public DataPacket() {
		// TODO 自動生成されたコンストラクター・スタブ
		reset();
	}

	public int pid() {
		return 0;
	}

	abstract public void encode();

	abstract public void decode();

	protected void reset() {
		baos.reset();
		baos.write(pid());
	}

	protected void clean() {
		baos.reset();
	}

	public int getChannel() {
		return channel;
	}

	public DataPacket setChannel(int channel) {
		this.channel = channel;
		return this;
	}

	public int getOffset() {
		return bais.getPos();
	}

	public byte[] getBuffer() {
		return baos.toByteArray();
	}

	protected byte[] get(int len) {
		byte[] buf = new byte[len];
		try {
			dis.readFully(buf);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return buf;
	}

	protected void put(byte[] arr) {
		try {
			dos.write(arr);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected long getLong() {
		try {
			return dis.readLong();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putLong(long value) {
		try {
			dos.writeLong(value);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected short getShort() {
		try {
			return dis.readShort();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putShort(short value) {
		try {
			dos.writeShort(value);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected int getInt() {
		try {
			return dis.readInt();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putInt(int value) {
		try {
			dos.writeInt(value);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected float getFloat() {
		try {
			return dis.readFloat();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putFloat(float value) {
		try {
			dos.writeFloat(value);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected int getTriad() {
		try {
			return dis.read() << 16 | dis.read() << 8 | dis.read();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putTriad(int value) {
		try {
			dos.write((value >> 16) & 0xFF);
			dos.write((value >> 8) & 0xFF);
			dos.write(value & 0xFF);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected int getLTriad() {
		try {
			return dis.read() | dis.read() << 8 | dis.read() << 16;
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putLTriad(int value) {
		try {
			dos.write(value & 0xFF);
			dos.write((value >> 8) & 0xFF);
			dos.write((value >> 16) & 0xFF);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected byte getByte() {
		try {
			return (byte) dis.read();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}

	protected void putByte(byte value) {
		try {
			dos.write(value);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	protected NBTTagCompound getMetadata() {
		try {
			NBTTagCompound nbt = new NBTTagCompound();
			return (NBTTagCompound) NBTTagCompound.class.getMethod("load",
					DataInputStream.class, int.class, NBTReadLimiter.class)
					.invoke(nbt, dis, 511, new NBTReadLimiter(10000));
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void putMetadata(NBTTagCompound nbt) {
		try {
			NBTTagCompound.class.getMethod("write", DataOutput.class).invoke(
					nbt, dos);
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	private class ByteArrayOutputStream extends OutputStream {
		protected byte buf[];
		protected int count;
		ByteArrayInputStream bais = new ByteArrayInputStream();

		public ByteArrayOutputStream() {
			this(32);
		}

		public ByteArrayOutputStream(int size) {
			if (size < 0) {
				throw new IllegalArgumentException("Negative initial size: "
						+ size);
			}
			buf = new byte[size];
		}

		private void ensureCapacity(int minCapacity) {
			// overflow-conscious code
			if (minCapacity - buf.length > 0)
				grow(minCapacity);
		}

		private void grow(int minCapacity) {
			// overflow-conscious code
			int oldCapacity = buf.length;
			int newCapacity = oldCapacity << 1;
			if (newCapacity - minCapacity < 0)
				newCapacity = minCapacity;
			if (newCapacity < 0) {
				if (minCapacity < 0) // overflow
					throw new OutOfMemoryError();
				newCapacity = Integer.MAX_VALUE;
			}
			buf = Arrays.copyOf(buf, newCapacity);
		}

		@Override
		public synchronized void write(int b) {
			ensureCapacity(count + 1);
			buf[count] = (byte) b;
			count += 1;
		}

		@Override
		public synchronized void write(byte b[], int off, int len) {
			if ((off < 0) || (off > b.length) || (len < 0)
					|| ((off + len) - b.length > 0)) {
				throw new IndexOutOfBoundsException();
			}
			ensureCapacity(count + len);
			System.arraycopy(b, off, buf, count, len);
			count += len;
		}

		public synchronized void writeTo(OutputStream out) throws IOException {
			out.write(buf, 0, count);
		}

		public synchronized void reset() {
			count = 0;
		}

		public synchronized byte toByteArray()[] {
			return Arrays.copyOf(buf, count);
		}

		public synchronized int size() {
			return count;
		}

		@Override
		public synchronized String toString() {
			return new String(buf, 0, count);
		}

		public synchronized String toString(String charsetName)
				throws UnsupportedEncodingException {
			return new String(buf, 0, count, charsetName);
		}

		@Deprecated
		public synchronized String toString(int hibyte) {
			return new String(buf, hibyte, 0, count);
		}

		@Override
		public void close() throws IOException {
		}

		public ByteArrayInputStream getInputStream() {
			return bais;
		}

		public class ByteArrayInputStream extends InputStream {

			protected byte buf[] = ByteArrayOutputStream.this.buf;
			protected int pos = 0;
			protected int mark = 0;

			public synchronized int getPos() {
				return pos;
			}

			public synchronized void setPos(int pos) {
				this.pos = pos;
			}

			@Override
			public synchronized int read() {
				return (pos < count) ? (buf[pos++] & 0xff) : -1;
			}

			@Override
			public synchronized int read(byte b[], int off, int len) {
				if (b == null) {
					throw new NullPointerException();
				} else if (off < 0 || len < 0 || len > b.length - off) {
					throw new IndexOutOfBoundsException();
				}

				if (pos >= count) {
					return -1;
				}

				int avail = count - pos;
				if (len > avail) {
					len = avail;
				}
				if (len <= 0) {
					return 0;
				}
				System.arraycopy(buf, pos, b, off, len);
				pos += len;
				return len;
			}

			@Override
			public synchronized long skip(long n) {
				long k = count - pos;
				if (n < k) {
					k = n < 0 ? 0 : n;
				}

				pos += k;
				return k;
			}

			@Override
			public synchronized int available() {
				return count - pos;
			}

			@Override
			public boolean markSupported() {
				return true;
			}

			@Override
			public void mark(int readAheadLimit) {
				mark = pos;
			}

			@Override
			public synchronized void reset() {
				pos = mark;
			}

			@Override
			public void close() throws IOException {
			}
		}
	}

	@Override
	public void a(PacketDataSerializer paramPacketDataSerializer)
			throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void b(PacketDataSerializer paramPacketDataSerializer)
			throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void a(LBPlayer paramT) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
