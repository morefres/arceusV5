.class public Lji/b$b$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lji/b$b;->a(Lih/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lih/a;

.field public final synthetic b:Lji/b$b;


# direct methods
.method public constructor <init>(Lji/b$b;Lih/a;)V
    .locals 0

    iput-object p1, p0, Lji/b$b$a;->b:Lji/b$b;

    iput-object p2, p0, Lji/b$b$a;->a:Lih/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    iget-object p1, p0, Lji/b$b$a;->b:Lji/b$b;

    iget-object p1, p1, Lji/b$b;->a:Lji/b;

    invoke-static {p1}, Lji/b;->d(Lji/b;)Lji/b$d;

    move-result-object p1

    iget-object p1, p1, Lji/b$d;->c:Ljava/net/Socket;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Close-connection-item] Error closing socket: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "InfluxV2Queue"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lji/b$b$a;->b:Lji/b$b;

    iget-object p1, p1, Lji/b$b;->a:Lji/b;

    invoke-static {p1}, Lji/b;->d(Lji/b;)Lji/b$d;

    move-result-object p1

    iput-object v0, p1, Lji/b$d;->c:Ljava/net/Socket;

    :cond_0
    iget-object p1, p0, Lji/b$b$a;->b:Lji/b$b;

    iget-object p1, p1, Lji/b$b;->a:Lji/b;

    invoke-static {p1, v0}, Lji/b;->e(Lji/b;Lji/b$d;)V

    return-object v0
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lji/b$b$a;->a:Lih/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lih/a;->a()V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lji/b$b$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lji/b$b$a;->b(Ljava/lang/Void;)V

    return-void
.end method
