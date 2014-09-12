/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_connection extends bandwidth_socket {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected peer_connection(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_connection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_connection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwnDerived) {
      swigCMemOwnDerived = false;
      libtorrent_jni.delete_peer_connection(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public int type() {
    return libtorrent_jni.peer_connection_type(swigCPtr, this);
  }

  public void start() {
    libtorrent_jni.peer_connection_start(swigCPtr, this);
  }

  public void set_peer_info(policy.peer pi) {
    libtorrent_jni.peer_connection_set_peer_info(swigCPtr, this, policy.peer.getCPtr(pi), pi);
  }

  public void peer_exceeds_limit() {
    libtorrent_jni.peer_connection_peer_exceeds_limit(swigCPtr, this);
  }

  public void peer_disconnected_other() {
    libtorrent_jni.peer_connection_peer_disconnected_other(swigCPtr, this);
  }

  public policy.peer peer_info_struct() {
    long cPtr = libtorrent_jni.peer_connection_peer_info_struct(swigCPtr, this);
    return (cPtr == 0) ? null : new policy.peer(cPtr, false);
  }

  public peer_connection.peer_speed_t peer_speed() {
    return peer_connection.peer_speed_t.swigToEnum(libtorrent_jni.peer_connection_peer_speed(swigCPtr, this));
  }

  public void send_allowed_set() {
    libtorrent_jni.peer_connection_send_allowed_set(swigCPtr, this);
  }

  public void add_extension(peer_plugin arg0) {
    libtorrent_jni.peer_connection_add_extension(swigCPtr, this, peer_plugin.getCPtr(arg0), arg0);
  }

  public peer_plugin find_plugin(String type) {
    long cPtr = libtorrent_jni.peer_connection_find_plugin(swigCPtr, this, type);
    return (cPtr == 0) ? null : new peer_plugin(cPtr, true);
  }

  public void init() {
    libtorrent_jni.peer_connection_init(swigCPtr, this);
  }

  public void on_metadata() {
    libtorrent_jni.peer_connection_on_metadata(swigCPtr, this);
  }

  public void on_metadata_impl() {
    libtorrent_jni.peer_connection_on_metadata_impl(swigCPtr, this);
  }

  public int get_upload_limit() {
    return libtorrent_jni.peer_connection_get_upload_limit(swigCPtr, this);
  }

  public int get_download_limit() {
    return libtorrent_jni.peer_connection_get_download_limit(swigCPtr, this);
  }

  public void set_upload_limit(int limit) {
    libtorrent_jni.peer_connection_set_upload_limit(swigCPtr, this, limit);
  }

  public void set_download_limit(int limit) {
    libtorrent_jni.peer_connection_set_download_limit(swigCPtr, this, limit);
  }

  public int upload_limit() {
    return libtorrent_jni.peer_connection_upload_limit(swigCPtr, this);
  }

  public int download_limit() {
    return libtorrent_jni.peer_connection_download_limit(swigCPtr, this);
  }

  public int prefer_whole_pieces() {
    return libtorrent_jni.peer_connection_prefer_whole_pieces__SWIG_0(swigCPtr, this);
  }

  public boolean on_parole() {
    return libtorrent_jni.peer_connection_on_parole(swigCPtr, this);
  }

  public int picker_options() {
    return libtorrent_jni.peer_connection_picker_options(swigCPtr, this);
  }

  public void prefer_whole_pieces(int num) {
    libtorrent_jni.peer_connection_prefer_whole_pieces__SWIG_1(swigCPtr, this, num);
  }

  public boolean request_large_blocks() {
    return libtorrent_jni.peer_connection_request_large_blocks__SWIG_0(swigCPtr, this);
  }

  public void request_large_blocks(boolean b) {
    libtorrent_jni.peer_connection_request_large_blocks__SWIG_1(swigCPtr, this, b);
  }

  public void set_endgame(boolean b) {
    libtorrent_jni.peer_connection_set_endgame(swigCPtr, this, b);
  }

  public boolean endgame() {
    return libtorrent_jni.peer_connection_endgame(swigCPtr, this);
  }

  public boolean no_download() {
    return libtorrent_jni.peer_connection_no_download__SWIG_0(swigCPtr, this);
  }

  public void no_download(boolean b) {
    libtorrent_jni.peer_connection_no_download__SWIG_1(swigCPtr, this, b);
  }

  public boolean ignore_stats() {
    return libtorrent_jni.peer_connection_ignore_stats__SWIG_0(swigCPtr, this);
  }

  public void ignore_stats(boolean b) {
    libtorrent_jni.peer_connection_ignore_stats__SWIG_1(swigCPtr, this, b);
  }

  public void set_priority(int p) {
    libtorrent_jni.peer_connection_set_priority(swigCPtr, this, p);
  }

  public long peer_rank() {
    return libtorrent_jni.peer_connection_peer_rank(swigCPtr, this);
  }

  public void fast_reconnect(boolean r) {
    libtorrent_jni.peer_connection_fast_reconnect__SWIG_0(swigCPtr, this, r);
  }

  public boolean fast_reconnect() {
    return libtorrent_jni.peer_connection_fast_reconnect__SWIG_1(swigCPtr, this);
  }

  public void announce_piece(int index) {
    libtorrent_jni.peer_connection_announce_piece(swigCPtr, this, index);
  }

  public void superseed_piece(int replace_piece, int new_piece) {
    libtorrent_jni.peer_connection_superseed_piece(swigCPtr, this, replace_piece, new_piece);
  }

  public boolean super_seeded_piece(int index) {
    return libtorrent_jni.peer_connection_super_seeded_piece(swigCPtr, this, index);
  }

  public boolean can_write() {
    return libtorrent_jni.peer_connection_can_write(swigCPtr, this);
  }

  public boolean can_read(SWIGTYPE_p_unsigned_char state) {
    return libtorrent_jni.peer_connection_can_read__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(state));
  }

  public boolean can_read() {
    return libtorrent_jni.peer_connection_can_read__SWIG_1(swigCPtr, this);
  }

  public boolean is_seed() {
    return libtorrent_jni.peer_connection_is_seed(swigCPtr, this);
  }

  public int num_have_pieces() {
    return libtorrent_jni.peer_connection_num_have_pieces(swigCPtr, this);
  }

  public void set_share_mode(boolean m) {
    libtorrent_jni.peer_connection_set_share_mode(swigCPtr, this, m);
  }

  public boolean share_mode() {
    return libtorrent_jni.peer_connection_share_mode(swigCPtr, this);
  }

  public void set_upload_only(boolean u) {
    libtorrent_jni.peer_connection_set_upload_only(swigCPtr, this, u);
  }

  public boolean upload_only() {
    return libtorrent_jni.peer_connection_upload_only(swigCPtr, this);
  }

  public void set_holepunch_mode() {
    libtorrent_jni.peer_connection_set_holepunch_mode(swigCPtr, this);
  }

  public void keep_alive() {
    libtorrent_jni.peer_connection_keep_alive(swigCPtr, this);
  }

  public sha1_hash pid() {
    return new sha1_hash(libtorrent_jni.peer_connection_pid(swigCPtr, this), false);
  }

  public void set_pid(sha1_hash peer_id) {
    libtorrent_jni.peer_connection_set_pid(swigCPtr, this, sha1_hash.getCPtr(peer_id), peer_id);
  }

  public boolean has_piece(int i) {
    return libtorrent_jni.peer_connection_has_piece(swigCPtr, this, i);
  }

  public pending_block_vector download_queue() {
    return new pending_block_vector(libtorrent_jni.peer_connection_download_queue(swigCPtr, this), false);
  }

  public pending_block_vector request_queue() {
    return new pending_block_vector(libtorrent_jni.peer_connection_request_queue(swigCPtr, this), false);
  }

  public peer_request_vector upload_queue() {
    return new peer_request_vector(libtorrent_jni.peer_connection_upload_queue(swigCPtr, this), false);
  }

  public void clear_request_queue() {
    libtorrent_jni.peer_connection_clear_request_queue(swigCPtr, this);
  }

  public SWIGTYPE_p_boost__posix_time__time_duration download_queue_time(int extra_bytes) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.peer_connection_download_queue_time__SWIG_0(swigCPtr, this, extra_bytes), true);
  }

  public SWIGTYPE_p_boost__posix_time__time_duration download_queue_time() {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.peer_connection_download_queue_time__SWIG_1(swigCPtr, this), true);
  }

  public boolean is_interesting() {
    return libtorrent_jni.peer_connection_is_interesting(swigCPtr, this);
  }

  public boolean is_choked() {
    return libtorrent_jni.peer_connection_is_choked(swigCPtr, this);
  }

  public boolean is_peer_interested() {
    return libtorrent_jni.peer_connection_is_peer_interested(swigCPtr, this);
  }

  public boolean has_peer_choked() {
    return libtorrent_jni.peer_connection_has_peer_choked(swigCPtr, this);
  }

  public void update_interest() {
    libtorrent_jni.peer_connection_update_interest(swigCPtr, this);
  }

  public void get_peer_info(peer_info p) {
    libtorrent_jni.peer_connection_get_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

  public SWIGTYPE_p_boost__weak_ptrT_libtorrent__torrent_t associated_torrent() {
    return new SWIGTYPE_p_boost__weak_ptrT_libtorrent__torrent_t(libtorrent_jni.peer_connection_associated_torrent(swigCPtr, this), true);
  }

  public stat statistics() {
    return new stat(libtorrent_jni.peer_connection_statistics(swigCPtr, this), false);
  }

  public void add_stat(long downloaded, long uploaded) {
    libtorrent_jni.peer_connection_add_stat(swigCPtr, this, downloaded, uploaded);
  }

  public void second_tick(int tick_interval_ms) {
    libtorrent_jni.peer_connection_second_tick(swigCPtr, this, tick_interval_ms);
  }

  public SWIGTYPE_p_boost__shared_ptrT_socket_type_t get_socket() {
    return new SWIGTYPE_p_boost__shared_ptrT_socket_type_t(libtorrent_jni.peer_connection_get_socket(swigCPtr, this), true);
  }

  public SWIGTYPE_p_tcp__endpoint remote() {
    return new SWIGTYPE_p_tcp__endpoint(libtorrent_jni.peer_connection_remote(swigCPtr, this), false);
  }

  public bitfield get_bitfield() {
    return new bitfield(libtorrent_jni.peer_connection_get_bitfield(swigCPtr, this), false);
  }

  public int_vector allowed_fast() {
    return new int_vector(libtorrent_jni.peer_connection_allowed_fast(swigCPtr, this), false);
  }

  public int_vector suggested_pieces() {
    return new int_vector(libtorrent_jni.peer_connection_suggested_pieces(swigCPtr, this), false);
  }

  public SWIGTYPE_p_boost__posix_time__ptime connected_time() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.peer_connection_connected_time(swigCPtr, this), true);
  }

  public SWIGTYPE_p_boost__posix_time__ptime last_received() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.peer_connection_last_received(swigCPtr, this), true);
  }

  public void on_timeout() {
    libtorrent_jni.peer_connection_on_timeout(swigCPtr, this);
  }

  public void disconnect(error_code ec, int error) {
    libtorrent_jni.peer_connection_disconnect__SWIG_0(swigCPtr, this, error_code.getCPtr(ec), ec, error);
  }

  public void disconnect(error_code ec) {
    libtorrent_jni.peer_connection_disconnect__SWIG_1(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public void connect_failed(error_code e) {
    libtorrent_jni.peer_connection_connect_failed(swigCPtr, this, error_code.getCPtr(e), e);
  }

  public boolean is_disconnecting() {
    return libtorrent_jni.peer_connection_is_disconnecting(swigCPtr, this);
  }

  public void on_connection_complete(error_code e) {
    libtorrent_jni.peer_connection_on_connection_complete(swigCPtr, this, error_code.getCPtr(e), e);
  }

  public boolean is_connecting() {
    return libtorrent_jni.peer_connection_is_connecting(swigCPtr, this);
  }

  public boolean is_queued() {
    return libtorrent_jni.peer_connection_is_queued(swigCPtr, this);
  }

  public void on_connect(int ticket) {
    libtorrent_jni.peer_connection_on_connect(swigCPtr, this, ticket);
  }

  public void received_valid_data(int index) {
    libtorrent_jni.peer_connection_received_valid_data(swigCPtr, this, index);
  }

  public boolean received_invalid_data(int index, boolean single_peer) {
    return libtorrent_jni.peer_connection_received_invalid_data(swigCPtr, this, index, single_peer);
  }

  public boolean is_outgoing() {
    return libtorrent_jni.peer_connection_is_outgoing(swigCPtr, this);
  }

  public boolean received_listen_port() {
    return libtorrent_jni.peer_connection_received_listen_port(swigCPtr, this);
  }

  public boolean on_local_network() {
    return libtorrent_jni.peer_connection_on_local_network(swigCPtr, this);
  }

  public boolean ignore_bandwidth_limits() {
    return libtorrent_jni.peer_connection_ignore_bandwidth_limits__SWIG_0(swigCPtr, this);
  }

  public void ignore_bandwidth_limits(boolean i) {
    libtorrent_jni.peer_connection_ignore_bandwidth_limits__SWIG_1(swigCPtr, this, i);
  }

  public boolean ignore_unchoke_slots() {
    return libtorrent_jni.peer_connection_ignore_unchoke_slots__SWIG_0(swigCPtr, this);
  }

  public void ignore_unchoke_slots(boolean i) {
    libtorrent_jni.peer_connection_ignore_unchoke_slots__SWIG_1(swigCPtr, this, i);
  }

  public boolean failed() {
    return libtorrent_jni.peer_connection_failed(swigCPtr, this);
  }

  public int desired_queue_size() {
    return libtorrent_jni.peer_connection_desired_queue_size(swigCPtr, this);
  }

  public boolean bittyrant_unchoke_compare(peer_connection p) {
    return libtorrent_jni.peer_connection_bittyrant_unchoke_compare(swigCPtr, this, peer_connection.getCPtr(p), p);
  }

  public boolean unchoke_compare(peer_connection p) {
    return libtorrent_jni.peer_connection_unchoke_compare(swigCPtr, this, peer_connection.getCPtr(p), p);
  }

  public boolean upload_rate_compare(peer_connection p) {
    return libtorrent_jni.peer_connection_upload_rate_compare(swigCPtr, this, peer_connection.getCPtr(p), p);
  }

  public void reset_choke_counters() {
    libtorrent_jni.peer_connection_reset_choke_counters(swigCPtr, this);
  }

  public void disconnect_if_redundant() {
    libtorrent_jni.peer_connection_disconnect_if_redundant(swigCPtr, this);
  }

  public void increase_est_reciprocation_rate() {
    libtorrent_jni.peer_connection_increase_est_reciprocation_rate(swigCPtr, this);
  }

  public void decrease_est_reciprocation_rate() {
    libtorrent_jni.peer_connection_decrease_est_reciprocation_rate(swigCPtr, this);
  }

  public int est_reciprocation_rate() {
    return libtorrent_jni.peer_connection_est_reciprocation_rate(swigCPtr, this);
  }

  public void incoming_keepalive() {
    libtorrent_jni.peer_connection_incoming_keepalive(swigCPtr, this);
  }

  public void incoming_choke() {
    libtorrent_jni.peer_connection_incoming_choke(swigCPtr, this);
  }

  public void incoming_unchoke() {
    libtorrent_jni.peer_connection_incoming_unchoke(swigCPtr, this);
  }

  public void incoming_interested() {
    libtorrent_jni.peer_connection_incoming_interested(swigCPtr, this);
  }

  public void incoming_not_interested() {
    libtorrent_jni.peer_connection_incoming_not_interested(swigCPtr, this);
  }

  public void incoming_have(int piece_index) {
    libtorrent_jni.peer_connection_incoming_have(swigCPtr, this, piece_index);
  }

  public void incoming_dont_have(int piece_index) {
    libtorrent_jni.peer_connection_incoming_dont_have(swigCPtr, this, piece_index);
  }

  public void incoming_bitfield(bitfield bits) {
    libtorrent_jni.peer_connection_incoming_bitfield(swigCPtr, this, bitfield.getCPtr(bits), bits);
  }

  public void incoming_request(peer_request r) {
    libtorrent_jni.peer_connection_incoming_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_piece(peer_request p, SWIGTYPE_p_disk_buffer_holder data) {
    libtorrent_jni.peer_connection_incoming_piece__SWIG_0(swigCPtr, this, peer_request.getCPtr(p), p, SWIGTYPE_p_disk_buffer_holder.getCPtr(data));
  }

  public void incoming_piece(peer_request p, String data) {
    libtorrent_jni.peer_connection_incoming_piece__SWIG_1(swigCPtr, this, peer_request.getCPtr(p), p, data);
  }

  public void incoming_piece_fragment(int bytes) {
    libtorrent_jni.peer_connection_incoming_piece_fragment(swigCPtr, this, bytes);
  }

  public void start_receive_piece(peer_request r) {
    libtorrent_jni.peer_connection_start_receive_piece(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_cancel(peer_request r) {
    libtorrent_jni.peer_connection_incoming_cancel(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public boolean can_disconnect(error_code ec) {
    return libtorrent_jni.peer_connection_can_disconnect(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public void incoming_dht_port(int listen_port) {
    libtorrent_jni.peer_connection_incoming_dht_port(swigCPtr, this, listen_port);
  }

  public void incoming_reject_request(peer_request r) {
    libtorrent_jni.peer_connection_incoming_reject_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_have_all() {
    libtorrent_jni.peer_connection_incoming_have_all(swigCPtr, this);
  }

  public void incoming_have_none() {
    libtorrent_jni.peer_connection_incoming_have_none(swigCPtr, this);
  }

  public void incoming_allowed_fast(int index) {
    libtorrent_jni.peer_connection_incoming_allowed_fast(swigCPtr, this, index);
  }

  public void incoming_suggest(int index) {
    libtorrent_jni.peer_connection_incoming_suggest(swigCPtr, this, index);
  }

  public void set_has_metadata(boolean m) {
    libtorrent_jni.peer_connection_set_has_metadata(swigCPtr, this, m);
  }

  public boolean has_metadata() {
    return libtorrent_jni.peer_connection_has_metadata(swigCPtr, this);
  }

  public boolean send_choke() {
    return libtorrent_jni.peer_connection_send_choke(swigCPtr, this);
  }

  public boolean send_unchoke() {
    return libtorrent_jni.peer_connection_send_unchoke(swigCPtr, this);
  }

  public void send_interested() {
    libtorrent_jni.peer_connection_send_interested(swigCPtr, this);
  }

  public void send_not_interested() {
    libtorrent_jni.peer_connection_send_not_interested(swigCPtr, this);
  }

  public void send_suggest(int piece) {
    libtorrent_jni.peer_connection_send_suggest(swigCPtr, this, piece);
  }

  public void snub_peer() {
    libtorrent_jni.peer_connection_snub_peer(swigCPtr, this);
  }

  public boolean can_request_time_critical() {
    return libtorrent_jni.peer_connection_can_request_time_critical(swigCPtr, this);
  }

  public boolean make_time_critical(SWIGTYPE_p_piece_block block) {
    return libtorrent_jni.peer_connection_make_time_critical(swigCPtr, this, SWIGTYPE_p_piece_block.getCPtr(block));
  }

  public boolean add_request(SWIGTYPE_p_piece_block b, int flags) {
    return libtorrent_jni.peer_connection_add_request__SWIG_0(swigCPtr, this, SWIGTYPE_p_piece_block.getCPtr(b), flags);
  }

  public boolean add_request(SWIGTYPE_p_piece_block b) {
    return libtorrent_jni.peer_connection_add_request__SWIG_1(swigCPtr, this, SWIGTYPE_p_piece_block.getCPtr(b));
  }

  public void cancel_all_requests() {
    libtorrent_jni.peer_connection_cancel_all_requests(swigCPtr, this);
  }

  public void cancel_request(SWIGTYPE_p_piece_block b, boolean force) {
    libtorrent_jni.peer_connection_cancel_request__SWIG_0(swigCPtr, this, SWIGTYPE_p_piece_block.getCPtr(b), force);
  }

  public void cancel_request(SWIGTYPE_p_piece_block b) {
    libtorrent_jni.peer_connection_cancel_request__SWIG_1(swigCPtr, this, SWIGTYPE_p_piece_block.getCPtr(b));
  }

  public void send_block_requests() {
    libtorrent_jni.peer_connection_send_block_requests(swigCPtr, this);
  }

  public int bandwidth_throttle(int channel) {
    return libtorrent_jni.peer_connection_bandwidth_throttle(swigCPtr, this, channel);
  }

  public void assign_bandwidth(int channel, int amount) {
    libtorrent_jni.peer_connection_assign_bandwidth(swigCPtr, this, channel, amount);
  }

  public boolean in_handshake() {
    return libtorrent_jni.peer_connection_in_handshake(swigCPtr, this);
  }

  public SWIGTYPE_p_boost__optionalT_piece_block_progress_t downloading_piece_progress() {
    return new SWIGTYPE_p_boost__optionalT_piece_block_progress_t(libtorrent_jni.peer_connection_downloading_piece_progress(swigCPtr, this), true);
  }

  public void send_buffer(String begin, int size, int flags, SWIGTYPE_p_f_p_char_int_p_void__void fun, SWIGTYPE_p_void userdata) {
    libtorrent_jni.peer_connection_send_buffer__SWIG_0(swigCPtr, this, begin, size, flags, SWIGTYPE_p_f_p_char_int_p_void__void.getCPtr(fun), SWIGTYPE_p_void.getCPtr(userdata));
  }

  public void send_buffer(String begin, int size, int flags, SWIGTYPE_p_f_p_char_int_p_void__void fun) {
    libtorrent_jni.peer_connection_send_buffer__SWIG_1(swigCPtr, this, begin, size, flags, SWIGTYPE_p_f_p_char_int_p_void__void.getCPtr(fun));
  }

  public void send_buffer(String begin, int size, int flags) {
    libtorrent_jni.peer_connection_send_buffer__SWIG_2(swigCPtr, this, begin, size, flags);
  }

  public void send_buffer(String begin, int size) {
    libtorrent_jni.peer_connection_send_buffer__SWIG_3(swigCPtr, this, begin, size);
  }

  public void setup_send() {
    libtorrent_jni.peer_connection_setup_send(swigCPtr, this);
  }

  public void cork_socket() {
    libtorrent_jni.peer_connection_cork_socket(swigCPtr, this);
  }

  public void uncork_socket() {
    libtorrent_jni.peer_connection_uncork_socket(swigCPtr, this);
  }

  public void append_const_send_buffer(String buffer, int size) {
    libtorrent_jni.peer_connection_append_const_send_buffer(swigCPtr, this, buffer, size);
  }

  public void set_country(String c) {
    libtorrent_jni.peer_connection_set_country(swigCPtr, this, c);
  }

  public boolean has_country() {
    return libtorrent_jni.peer_connection_has_country(swigCPtr, this);
  }

  public int outstanding_bytes() {
    return libtorrent_jni.peer_connection_outstanding_bytes(swigCPtr, this);
  }

  public int send_buffer_size() {
    return libtorrent_jni.peer_connection_send_buffer_size(swigCPtr, this);
  }

  public int send_buffer_capacity() {
    return libtorrent_jni.peer_connection_send_buffer_capacity(swigCPtr, this);
  }

  public int packet_size() {
    return libtorrent_jni.peer_connection_packet_size(swigCPtr, this);
  }

  public boolean packet_finished() {
    return libtorrent_jni.peer_connection_packet_finished(swigCPtr, this);
  }

  public int receive_pos() {
    return libtorrent_jni.peer_connection_receive_pos(swigCPtr, this);
  }

  public void max_out_request_queue(int s) {
    libtorrent_jni.peer_connection_max_out_request_queue__SWIG_0(swigCPtr, this, s);
  }

  public int max_out_request_queue() {
    return libtorrent_jni.peer_connection_max_out_request_queue__SWIG_1(swigCPtr, this);
  }

  public int last_seen_complete() {
    return libtorrent_jni.peer_connection_last_seen_complete(swigCPtr, this);
  }

  public void set_last_seen_complete(int ago) {
    libtorrent_jni.peer_connection_set_last_seen_complete(swigCPtr, this, ago);
  }

  public long uploaded_in_last_round() {
    return libtorrent_jni.peer_connection_uploaded_in_last_round(swigCPtr, this);
  }

  public long downloaded_in_last_round() {
    return libtorrent_jni.peer_connection_downloaded_in_last_round(swigCPtr, this);
  }

  public long uploaded_since_unchoked() {
    return libtorrent_jni.peer_connection_uploaded_since_unchoked(swigCPtr, this);
  }

  public void on_disk() {
    libtorrent_jni.peer_connection_on_disk(swigCPtr, this);
  }

  public int num_reading_bytes() {
    return libtorrent_jni.peer_connection_num_reading_bytes(swigCPtr, this);
  }

  public void setup_receive(peer_connection.sync_t sync) {
    libtorrent_jni.peer_connection_setup_receive__SWIG_0(swigCPtr, this, sync.swigValue());
  }

  public void setup_receive() {
    libtorrent_jni.peer_connection_setup_receive__SWIG_1(swigCPtr, this);
  }

  public void setM_channel_state(SWIGTYPE_p_unsigned_char value) {
    libtorrent_jni.peer_connection_m_channel_state_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getM_channel_state() {
    long cPtr = libtorrent_jni.peer_connection_m_channel_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public enum connection_type {
    bittorrent_connection(libtorrent_jni.peer_connection_bittorrent_connection_get()),
    url_seed_connection(libtorrent_jni.peer_connection_url_seed_connection_get()),
    http_seed_connection(libtorrent_jni.peer_connection_http_seed_connection_get());

    public final int swigValue() {
      return swigValue;
    }

    public static connection_type swigToEnum(int swigValue) {
      connection_type[] swigValues = connection_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (connection_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + connection_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private connection_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private connection_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private connection_type(connection_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum channels {
    upload_channel,
    download_channel,
    num_channels;

    public final int swigValue() {
      return swigValue;
    }

    public static channels swigToEnum(int swigValue) {
      channels[] swigValues = channels.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (channels swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + channels.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private channels() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private channels(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private channels(channels swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum peer_speed_t {
    slow(libtorrent_jni.peer_connection_slow_get()),
    medium,
    fast;

    public final int swigValue() {
      return swigValue;
    }

    public static peer_speed_t swigToEnum(int swigValue) {
      peer_speed_t[] swigValues = peer_speed_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (peer_speed_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + peer_speed_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private peer_speed_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private peer_speed_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private peer_speed_t(peer_speed_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum flags_t {
    req_time_critical(libtorrent_jni.peer_connection_req_time_critical_get()),
    req_busy(libtorrent_jni.peer_connection_req_busy_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum message_type_flags {
    message_type_request(libtorrent_jni.peer_connection_message_type_request_get());

    public final int swigValue() {
      return swigValue;
    }

    public static message_type_flags swigToEnum(int swigValue) {
      message_type_flags[] swigValues = message_type_flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (message_type_flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + message_type_flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private message_type_flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private message_type_flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private message_type_flags(message_type_flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum sync_t {
    read_async,
    read_sync;

    public final int swigValue() {
      return swigValue;
    }

    public static sync_t swigToEnum(int swigValue) {
      sync_t[] swigValues = sync_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (sync_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + sync_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private sync_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private sync_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private sync_t(sync_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}