/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.sga.sangam.auroraclient.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-21")
public class JobStats implements org.apache.thrift.TBase<JobStats, JobStats._Fields>, java.io.Serializable, Cloneable, Comparable<JobStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobStats");

  private static final org.apache.thrift.protocol.TField ACTIVE_TASK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("activeTaskCount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FINISHED_TASK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("finishedTaskCount", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FAILED_TASK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("failedTaskCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PENDING_TASK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("pendingTaskCount", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobStatsTupleSchemeFactory());
  }

  /**
   * Number of tasks in active state for this job.
   */
  public int activeTaskCount; // required
  /**
   * Number of tasks in finished state for this job.
   */
  public int finishedTaskCount; // required
  /**
   * Number of failed tasks for this job.
   */
  public int failedTaskCount; // required
  /**
   * Number of tasks in pending state for this job.
   */
  public int pendingTaskCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Number of tasks in active state for this job.
     */
    ACTIVE_TASK_COUNT((short)1, "activeTaskCount"),
    /**
     * Number of tasks in finished state for this job.
     */
    FINISHED_TASK_COUNT((short)2, "finishedTaskCount"),
    /**
     * Number of failed tasks for this job.
     */
    FAILED_TASK_COUNT((short)3, "failedTaskCount"),
    /**
     * Number of tasks in pending state for this job.
     */
    PENDING_TASK_COUNT((short)4, "pendingTaskCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACTIVE_TASK_COUNT
          return ACTIVE_TASK_COUNT;
        case 2: // FINISHED_TASK_COUNT
          return FINISHED_TASK_COUNT;
        case 3: // FAILED_TASK_COUNT
          return FAILED_TASK_COUNT;
        case 4: // PENDING_TASK_COUNT
          return PENDING_TASK_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ACTIVETASKCOUNT_ISSET_ID = 0;
  private static final int __FINISHEDTASKCOUNT_ISSET_ID = 1;
  private static final int __FAILEDTASKCOUNT_ISSET_ID = 2;
  private static final int __PENDINGTASKCOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVE_TASK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("activeTaskCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FINISHED_TASK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("finishedTaskCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FAILED_TASK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("failedTaskCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PENDING_TASK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("pendingTaskCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobStats.class, metaDataMap);
  }

  public JobStats() {
  }

  public JobStats(
    int activeTaskCount,
    int finishedTaskCount,
    int failedTaskCount,
    int pendingTaskCount)
  {
    this();
    this.activeTaskCount = activeTaskCount;
    setActiveTaskCountIsSet(true);
    this.finishedTaskCount = finishedTaskCount;
    setFinishedTaskCountIsSet(true);
    this.failedTaskCount = failedTaskCount;
    setFailedTaskCountIsSet(true);
    this.pendingTaskCount = pendingTaskCount;
    setPendingTaskCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobStats(JobStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.activeTaskCount = other.activeTaskCount;
    this.finishedTaskCount = other.finishedTaskCount;
    this.failedTaskCount = other.failedTaskCount;
    this.pendingTaskCount = other.pendingTaskCount;
  }

  public JobStats deepCopy() {
    return new JobStats(this);
  }

  @Override
  public void clear() {
    setActiveTaskCountIsSet(false);
    this.activeTaskCount = 0;
    setFinishedTaskCountIsSet(false);
    this.finishedTaskCount = 0;
    setFailedTaskCountIsSet(false);
    this.failedTaskCount = 0;
    setPendingTaskCountIsSet(false);
    this.pendingTaskCount = 0;
  }

  /**
   * Number of tasks in active state for this job.
   */
  public int getActiveTaskCount() {
    return this.activeTaskCount;
  }

  /**
   * Number of tasks in active state for this job.
   */
  public JobStats setActiveTaskCount(int activeTaskCount) {
    this.activeTaskCount = activeTaskCount;
    setActiveTaskCountIsSet(true);
    return this;
  }

  public void unsetActiveTaskCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVETASKCOUNT_ISSET_ID);
  }

  /** Returns true if field activeTaskCount is set (has been assigned a value) and false otherwise */
  public boolean isSetActiveTaskCount() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVETASKCOUNT_ISSET_ID);
  }

  public void setActiveTaskCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVETASKCOUNT_ISSET_ID, value);
  }

  /**
   * Number of tasks in finished state for this job.
   */
  public int getFinishedTaskCount() {
    return this.finishedTaskCount;
  }

  /**
   * Number of tasks in finished state for this job.
   */
  public JobStats setFinishedTaskCount(int finishedTaskCount) {
    this.finishedTaskCount = finishedTaskCount;
    setFinishedTaskCountIsSet(true);
    return this;
  }

  public void unsetFinishedTaskCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FINISHEDTASKCOUNT_ISSET_ID);
  }

  /** Returns true if field finishedTaskCount is set (has been assigned a value) and false otherwise */
  public boolean isSetFinishedTaskCount() {
    return EncodingUtils.testBit(__isset_bitfield, __FINISHEDTASKCOUNT_ISSET_ID);
  }

  public void setFinishedTaskCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FINISHEDTASKCOUNT_ISSET_ID, value);
  }

  /**
   * Number of failed tasks for this job.
   */
  public int getFailedTaskCount() {
    return this.failedTaskCount;
  }

  /**
   * Number of failed tasks for this job.
   */
  public JobStats setFailedTaskCount(int failedTaskCount) {
    this.failedTaskCount = failedTaskCount;
    setFailedTaskCountIsSet(true);
    return this;
  }

  public void unsetFailedTaskCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FAILEDTASKCOUNT_ISSET_ID);
  }

  /** Returns true if field failedTaskCount is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedTaskCount() {
    return EncodingUtils.testBit(__isset_bitfield, __FAILEDTASKCOUNT_ISSET_ID);
  }

  public void setFailedTaskCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FAILEDTASKCOUNT_ISSET_ID, value);
  }

  /**
   * Number of tasks in pending state for this job.
   */
  public int getPendingTaskCount() {
    return this.pendingTaskCount;
  }

  /**
   * Number of tasks in pending state for this job.
   */
  public JobStats setPendingTaskCount(int pendingTaskCount) {
    this.pendingTaskCount = pendingTaskCount;
    setPendingTaskCountIsSet(true);
    return this;
  }

  public void unsetPendingTaskCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PENDINGTASKCOUNT_ISSET_ID);
  }

  /** Returns true if field pendingTaskCount is set (has been assigned a value) and false otherwise */
  public boolean isSetPendingTaskCount() {
    return EncodingUtils.testBit(__isset_bitfield, __PENDINGTASKCOUNT_ISSET_ID);
  }

  public void setPendingTaskCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PENDINGTASKCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVE_TASK_COUNT:
      if (value == null) {
        unsetActiveTaskCount();
      } else {
        setActiveTaskCount((Integer)value);
      }
      break;

    case FINISHED_TASK_COUNT:
      if (value == null) {
        unsetFinishedTaskCount();
      } else {
        setFinishedTaskCount((Integer)value);
      }
      break;

    case FAILED_TASK_COUNT:
      if (value == null) {
        unsetFailedTaskCount();
      } else {
        setFailedTaskCount((Integer)value);
      }
      break;

    case PENDING_TASK_COUNT:
      if (value == null) {
        unsetPendingTaskCount();
      } else {
        setPendingTaskCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVE_TASK_COUNT:
      return getActiveTaskCount();

    case FINISHED_TASK_COUNT:
      return getFinishedTaskCount();

    case FAILED_TASK_COUNT:
      return getFailedTaskCount();

    case PENDING_TASK_COUNT:
      return getPendingTaskCount();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVE_TASK_COUNT:
      return isSetActiveTaskCount();
    case FINISHED_TASK_COUNT:
      return isSetFinishedTaskCount();
    case FAILED_TASK_COUNT:
      return isSetFailedTaskCount();
    case PENDING_TASK_COUNT:
      return isSetPendingTaskCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobStats)
      return this.equals((JobStats)that);
    return false;
  }

  public boolean equals(JobStats that) {
    if (that == null)
      return false;

    boolean this_present_activeTaskCount = true;
    boolean that_present_activeTaskCount = true;
    if (this_present_activeTaskCount || that_present_activeTaskCount) {
      if (!(this_present_activeTaskCount && that_present_activeTaskCount))
        return false;
      if (this.activeTaskCount != that.activeTaskCount)
        return false;
    }

    boolean this_present_finishedTaskCount = true;
    boolean that_present_finishedTaskCount = true;
    if (this_present_finishedTaskCount || that_present_finishedTaskCount) {
      if (!(this_present_finishedTaskCount && that_present_finishedTaskCount))
        return false;
      if (this.finishedTaskCount != that.finishedTaskCount)
        return false;
    }

    boolean this_present_failedTaskCount = true;
    boolean that_present_failedTaskCount = true;
    if (this_present_failedTaskCount || that_present_failedTaskCount) {
      if (!(this_present_failedTaskCount && that_present_failedTaskCount))
        return false;
      if (this.failedTaskCount != that.failedTaskCount)
        return false;
    }

    boolean this_present_pendingTaskCount = true;
    boolean that_present_pendingTaskCount = true;
    if (this_present_pendingTaskCount || that_present_pendingTaskCount) {
      if (!(this_present_pendingTaskCount && that_present_pendingTaskCount))
        return false;
      if (this.pendingTaskCount != that.pendingTaskCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_activeTaskCount = true;
    list.add(present_activeTaskCount);
    if (present_activeTaskCount)
      list.add(activeTaskCount);

    boolean present_finishedTaskCount = true;
    list.add(present_finishedTaskCount);
    if (present_finishedTaskCount)
      list.add(finishedTaskCount);

    boolean present_failedTaskCount = true;
    list.add(present_failedTaskCount);
    if (present_failedTaskCount)
      list.add(failedTaskCount);

    boolean present_pendingTaskCount = true;
    list.add(present_pendingTaskCount);
    if (present_pendingTaskCount)
      list.add(pendingTaskCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetActiveTaskCount()).compareTo(other.isSetActiveTaskCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActiveTaskCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activeTaskCount, other.activeTaskCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFinishedTaskCount()).compareTo(other.isSetFinishedTaskCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinishedTaskCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finishedTaskCount, other.finishedTaskCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailedTaskCount()).compareTo(other.isSetFailedTaskCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedTaskCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failedTaskCount, other.failedTaskCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPendingTaskCount()).compareTo(other.isSetPendingTaskCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPendingTaskCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pendingTaskCount, other.pendingTaskCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobStats(");
    boolean first = true;

    sb.append("activeTaskCount:");
    sb.append(this.activeTaskCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("finishedTaskCount:");
    sb.append(this.finishedTaskCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("failedTaskCount:");
    sb.append(this.failedTaskCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pendingTaskCount:");
    sb.append(this.pendingTaskCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStatsStandardSchemeFactory implements SchemeFactory {
    public JobStatsStandardScheme getScheme() {
      return new JobStatsStandardScheme();
    }
  }

  private static class JobStatsStandardScheme extends StandardScheme<JobStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVE_TASK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.activeTaskCount = iprot.readI32();
              struct.setActiveTaskCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FINISHED_TASK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.finishedTaskCount = iprot.readI32();
              struct.setFinishedTaskCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FAILED_TASK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.failedTaskCount = iprot.readI32();
              struct.setFailedTaskCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PENDING_TASK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pendingTaskCount = iprot.readI32();
              struct.setPendingTaskCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTIVE_TASK_COUNT_FIELD_DESC);
      oprot.writeI32(struct.activeTaskCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FINISHED_TASK_COUNT_FIELD_DESC);
      oprot.writeI32(struct.finishedTaskCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FAILED_TASK_COUNT_FIELD_DESC);
      oprot.writeI32(struct.failedTaskCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PENDING_TASK_COUNT_FIELD_DESC);
      oprot.writeI32(struct.pendingTaskCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobStatsTupleSchemeFactory implements SchemeFactory {
    public JobStatsTupleScheme getScheme() {
      return new JobStatsTupleScheme();
    }
  }

  private static class JobStatsTupleScheme extends TupleScheme<JobStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActiveTaskCount()) {
        optionals.set(0);
      }
      if (struct.isSetFinishedTaskCount()) {
        optionals.set(1);
      }
      if (struct.isSetFailedTaskCount()) {
        optionals.set(2);
      }
      if (struct.isSetPendingTaskCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetActiveTaskCount()) {
        oprot.writeI32(struct.activeTaskCount);
      }
      if (struct.isSetFinishedTaskCount()) {
        oprot.writeI32(struct.finishedTaskCount);
      }
      if (struct.isSetFailedTaskCount()) {
        oprot.writeI32(struct.failedTaskCount);
      }
      if (struct.isSetPendingTaskCount()) {
        oprot.writeI32(struct.pendingTaskCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.activeTaskCount = iprot.readI32();
        struct.setActiveTaskCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.finishedTaskCount = iprot.readI32();
        struct.setFinishedTaskCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.failedTaskCount = iprot.readI32();
        struct.setFailedTaskCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pendingTaskCount = iprot.readI32();
        struct.setPendingTaskCountIsSet(true);
      }
    }
  }

}

