.class public Lih/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lih/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lih/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lih/b;


# direct methods
.method public constructor <init>(Lih/b;)V
    .locals 0

    iput-object p1, p0, Lih/b$a;->a:Lih/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lih/b$a;->a:Lih/b;

    sget-object v1, Lih/b$c;->a:Lih/b$c;

    invoke-static {v0, v1}, Lih/b;->a(Lih/b;Lih/b$c;)V

    iget-object v0, p0, Lih/b$a;->a:Lih/b;

    invoke-virtual {v0}, Lih/b;->c()V

    return-void
.end method
