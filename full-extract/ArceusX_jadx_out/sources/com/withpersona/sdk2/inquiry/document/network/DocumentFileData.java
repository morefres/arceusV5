package com.withpersona.sdk2.inquiry.document.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.i;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "", "", "id", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "Attributes", "RemoteDocumentFile", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocumentFileData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Attributes attributes;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "originals", "<init>", "(Ljava/util/List;)V", ve.a.f33391e, "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Attributes {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<RemoteDocumentFile> originals;

        public Attributes(@Nullable List<RemoteDocumentFile> list) {
            this.originals = list;
        }

        @Nullable
        public final List<RemoteDocumentFile> a() {
            return this.originals;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "", "", "url", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteDocumentFile {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String filename;

        public RemoteDocumentFile(@NotNull String url, @NotNull String filename) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(filename, "filename");
            this.url = url;
            this.filename = filename;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    public DocumentFileData(@NotNull String id2, @Nullable Attributes attributes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.attributes = attributes;
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
