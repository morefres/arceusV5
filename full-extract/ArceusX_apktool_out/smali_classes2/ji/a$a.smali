.class public Lji/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lji/a;->a(Lih/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lih/a;

.field public final synthetic b:Lji/a;


# direct methods
.method public constructor <init>(Lji/a;Lih/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lji/a$a;->b:Lji/a;

    iput-object p2, p0, Lji/a$a;->a:Lih/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lak/d;)V
    .locals 0

    iget-object p1, p0, Lji/a$a;->a:Lih/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lih/a;->a()V

    :cond_0
    return-void
.end method
