.class public Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/common/serialization/CustomGsonBuilder;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public buildGson()Ljg/f;
    .locals 3

    new-instance v0, Ljg/g;

    invoke-direct {v0}, Ljg/g;-><init>()V

    sget-object v1, Ljg/c;->f:Ljg/c;

    invoke-virtual {v0, v1}, Ljg/g;->g(Ljg/c;)Ljg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;-><init>()V

    const-class v2, Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v2, v1}, Ljg/g;->d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;-><init>()V

    invoke-virtual {v0, v1}, Ljg/g;->e(Ljg/b0;)Ljg/g;

    move-result-object v0

    invoke-virtual {v0}, Ljg/g;->b()Ljg/f;

    move-result-object v0

    return-object v0
.end method
