.class Lcom/google/gson/internal/Excluder$1;
.super Ljg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/Excluder;->create(Ljg/f;Lcom/google/gson/reflect/TypeToken;)Ljg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private volatile delegate:Ljg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/gson/internal/Excluder;

.field final synthetic val$gson:Ljg/f;

.field final synthetic val$skipDeserialize:Z

.field final synthetic val$skipSerialize:Z

.field final synthetic val$type:Lcom/google/gson/reflect/TypeToken;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/Excluder;ZZLjg/f;Lcom/google/gson/reflect/TypeToken;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/Excluder$1;->this$0:Lcom/google/gson/internal/Excluder;

    iput-boolean p2, p0, Lcom/google/gson/internal/Excluder$1;->val$skipDeserialize:Z

    iput-boolean p3, p0, Lcom/google/gson/internal/Excluder$1;->val$skipSerialize:Z

    iput-object p4, p0, Lcom/google/gson/internal/Excluder$1;->val$gson:Ljg/f;

    iput-object p5, p0, Lcom/google/gson/internal/Excluder$1;->val$type:Lcom/google/gson/reflect/TypeToken;

    invoke-direct {p0}, Ljg/a0;-><init>()V

    return-void
.end method

.method private delegate()Ljg/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/Excluder$1;->delegate:Ljg/a0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/Excluder$1;->val$gson:Ljg/f;

    iget-object v1, p0, Lcom/google/gson/internal/Excluder$1;->this$0:Lcom/google/gson/internal/Excluder;

    iget-object v2, p0, Lcom/google/gson/internal/Excluder$1;->val$type:Lcom/google/gson/reflect/TypeToken;

    invoke-virtual {v0, v1, v2}, Ljg/f;->p(Ljg/b0;Lcom/google/gson/reflect/TypeToken;)Ljg/a0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/internal/Excluder$1;->delegate:Ljg/a0;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/gson/internal/Excluder$1;->val$skipDeserialize:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->skipValue()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lcom/google/gson/internal/Excluder$1;->delegate()Ljg/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljg/a0;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/gson/internal/Excluder$1;->val$skipSerialize:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/gson/internal/Excluder$1;->delegate()Ljg/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljg/a0;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
