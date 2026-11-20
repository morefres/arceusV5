.class public Lvg/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg/b$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lll/a;

.field public final synthetic b:Lvg/b$a;


# direct methods
.method public constructor <init>(Lvg/b$a;Lll/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvg/b$a$a;->b:Lvg/b$a;

    iput-object p2, p0, Lvg/b$a$a;->a:Lll/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lvg/b$a$a;->b:Lvg/b$a;

    iget-object v0, v0, Lvg/b$a;->a:Lvg/b;

    invoke-static {v0}, Lvg/b;->a(Lvg/b;)Lvg/b$d;

    move-result-object v0

    iget-object v1, p0, Lvg/b$a$a;->a:Lll/a;

    invoke-interface {v0, v1}, Lvg/b$d;->d(Lll/a;)V

    return-void
.end method
